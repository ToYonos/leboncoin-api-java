package info.toyonos.lbc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import info.toyonos.lbc.handler.AdCreationFilter;
import info.toyonos.lbc.handler.AdsFilter;
import info.toyonos.lbc.handler.AdsHandler;
import info.toyonos.lbc.handler.FreeMobileSmsNotifier;
import info.toyonos.lbc.input.AdsSearch.SortOrder;
import info.toyonos.lbc.output.Ad;

public class LeBonCoinAlertManager
{
	public static void main(String[] args)
	{
		LeBonCoinClient client = new LeBonCoinClient();
		List<AdsFilter> adsFilters = Arrays.asList(new AdCreationFilter(1));
		AdsHandler finisher = new FreeMobileSmsNotifier("*******", "*************");
		
		if (args.length > 2)
		{
			String city = args[0];
			Integer radius = Integer.valueOf(args[1]);

			for (int i = 2; i < args.length; i++)
			{
				Stream<Ad> adsStream = client.searchAdvertsByCity(args[i], city, radius, "date", SortOrder.DESC).stream();
				for (AdsFilter filter : adsFilters)
				{
					adsStream = adsStream.filter(filter);
				}
				finisher.handle(adsStream);
			}
		}
		else
		{
			System.err.println("Usage: java -jar lbc-all.jar city radius \"a list of keywords\" [\"another list of keywords\"]");
		}
	}
}
