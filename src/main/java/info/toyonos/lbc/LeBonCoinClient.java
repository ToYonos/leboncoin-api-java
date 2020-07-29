package info.toyonos.lbc;

import java.util.List;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.message.GZipEncoder;

import info.toyonos.lbc.input.AdsSearch;
import info.toyonos.lbc.input.AdsSearch.SortOrder;
import info.toyonos.lbc.output.Ad;
import info.toyonos.lbc.output.SearchResult;

/**
 * Client for the API from LeBonCoin
 * @see https://github.com/tdurieux/leboncoin-api
 */
public class LeBonCoinClient
{
	private static final String ENDPOINT = "https://api.leboncoin.fr";
	
	//private static final java.util.logging.Logger API_LOGGER = java.util.logging.Logger.getLogger(LoggingFeature.DEFAULT_LOGGER_NAME);

	private GeoApiClient geoApiClient;
	private WebTarget webTarget;
	
	static
	{
		System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
	}
	
	public LeBonCoinClient()
	{
		geoApiClient = new GeoApiClient();
		webTarget = ClientBuilder.newClient()
		//.register(new LoggingFeature(API_LOGGER, Level.INFO, LoggingFeature.Verbosity.PAYLOAD_ANY, 10 * 1024 * 1024))
		.register(GZipEncoder.class).target(ENDPOINT);
	}

	private <T> T doGet(String path, Object input, Class<T> resultClass)
	{
		return webTarget.path(path)
		.request(MediaType.APPLICATION_JSON)
		.header("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/76.0.3809.100 Safari/537.36")
		.header("Accept-Language", "*")
		.header("Accept", "*/*")
		.header("Accept-Encoding", "gzip, deflate, br")
		.header("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8")
		.header("Content-Type", "application/json")
		.header("Referer", "https://www.leboncoin.fr/recherche/")
		.header("Origin", "https://www.leboncoin.fr")
		.post(Entity.json(input), resultClass);
	}

	/**
	 * Retrieve a <code>List</code> of <code>Ad</code> for the target keywords, in a city with a specified radius
	 * @param keywords 
	 * @param zipCode the zip code of the city
	 * @param radius the radius, in meters, relatively to the center of the city0
	 * @param sortBy the field on which the sort should be based
	 * @param sortOrder the type of sort
	 * @return a <code>List</code> of <code>Ad</code>
	 */
	public List<Ad> searchAdvertsByZip(String keywords, String zipCode, int radius, String sortBy, SortOrder sortOrder)
	{
		Double[] coordinates = geoApiClient.getGpsCoordinatesFromZip(zipCode);
		
		if (coordinates == null)
		{
			throw new IllegalArgumentException(String.format("The zip code %s is unknown", zipCode));
		}
		
		return searchAdverts(keywords, coordinates, radius, sortBy, sortOrder);
	}
	
	/**
	 * Retrieve a <code>List</code> of <code>Ad</code> for the target keywords, in a city with a specified radius
	 * @param keywords 
	 * @param zipCode the name of the city
	 * @param radius the radius, in meters, relatively to the center of the city0
	 * @param sortBy the field on which the sort should be based
	 * @param sortOrder the type of sort
	 * @return a <code>List</code> of <code>Ad</code>
	 */
	public List<Ad> searchAdvertsByCity(String keywords, String city, int radius, String sortBy, SortOrder sortOrder)
	{
		Double[] coordinates = geoApiClient.getGpsCoordinatesFromCity(city);
		
		if (coordinates == null)
		{
			throw new IllegalArgumentException(String.format("The city %s is unknown", city));
		}
		
		return searchAdverts(keywords, coordinates, radius, sortBy, sortOrder);
	}
	
	private List<Ad> searchAdverts(String keywords, Double[] coordinates, int radius, String sortBy, SortOrder sortOrder)
	{		
		return doGet(
			"/finder/search",
			new AdsSearch(20, 0, null, sortBy, sortOrder, keywords, coordinates[1], coordinates[0], radius),
			SearchResult.class
		).getAds();
	}
	
	// TODO more methods
}
