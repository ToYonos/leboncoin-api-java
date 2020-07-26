package info.toyonos.lbc;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.message.GZipEncoder;

import info.toyonos.lbc.input.AdsSearch;
import info.toyonos.lbc.output.Ad;
import info.toyonos.lbc.output.SearchResult;

public class LeBonCoinClient
{
	private static final String ENDPOINT = "https://api.leboncoin.fr";
	
	//private static final java.util.logging.Logger API_LOGGER = java.util.logging.Logger.getLogger(LoggingFeature.DEFAULT_LOGGER_NAME);

	private WebTarget webTarget;
	
	public LeBonCoinClient()
	{
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

	public List<Ad> searchAdverts(String keywords, double lat, double lgn, int radius, String sortBy, String sortOrder)
	{
		return doGet(
			"/finder/search",
			new AdsSearch(20, 0, null, sortBy, sortOrder, keywords, lat, lgn, radius),
			SearchResult.class
		).getAds();
	}
	
	// TODO more methods
	
	public static void main(String[] args)
	{
		LeBonCoinClient client = new LeBonCoinClient();

		Date nowMinus1Day = Date.from(LocalDateTime.now().minusDays(1).atZone(ZoneId.systemDefault()).toInstant());
		client.searchAdverts("mario kart switch", 47.214650, -1.547044, 50000, "date", "desc").stream()
		.filter(ad -> ad.getFirstPublicationDate().after(nowMinus1Day))
		.forEach(ad ->
		{
			System.out.println(ad.getFirstPublicationDate() + " -> " + ad.getSubject() + " : " + ad.getPrice());
			System.out.println(ad.getUrl());
			System.out.println();
		});
	}
}
