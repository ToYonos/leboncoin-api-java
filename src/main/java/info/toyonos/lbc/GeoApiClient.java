package info.toyonos.lbc;

import javax.json.JsonNumber;
import javax.json.JsonObject;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.jsonp.JsonProcessingFeature;

/**
 * Client for the API geo.api.gouv.fr
 * @see https://geo.api.gouv.fr/decoupage-administratif/communes
 * @author philippe
 *
 */
public class GeoApiClient
{
	private static final String ENDPOINT = "https://geo.api.gouv.fr";

	private WebTarget webTarget;

	public GeoApiClient()
	{
		webTarget = ClientBuilder.newClient().register(JsonProcessingFeature.class).target(ENDPOINT);
	}

	/**
	 * Retrieve the gps coordinates of the center of the target city 
	 * @param zipCode the zip code of the city
	 * @return the gps coordinates as an array of <code>Double</code> or <code>null</code> if it does not exist
	 */
	public Double[] getGpsCoordinatesFromZip(String zipCode)
	{
		return getGpsCoordinates(webTarget.queryParam("codePostal", zipCode));
	}

	/**
	 * Retrieve the gps coordinates of the center of the target city 
	 * @param city the name of the city
	 * @return the gps coordinates as an array of <code>Double</code> or <code>null</code> if it does not exist
	 */
	public Double[] getGpsCoordinatesFromCity(String city)
	{
		return getGpsCoordinates(webTarget.queryParam("nom", city));
	}

	private Double[] getGpsCoordinates(WebTarget wt)
	{
		JsonObject result = wt
			.path("communes")
			.queryParam("format", "geojson")
			.request(MediaType.APPLICATION_JSON_TYPE)
			.get(JsonObject.class);
		
		return result.getJsonArray("features").stream()
			.map(v -> v.asJsonObject().getJsonObject("geometry").getJsonArray("coordinates"))
			.map(c -> c.stream().map(v -> JsonNumber.class.cast(v).doubleValue()).toArray(Double[]::new))
			.findFirst().orElse(null);
	}
}