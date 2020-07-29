package info.toyonos.lbc.handler;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.stream.Stream;

import info.toyonos.lbc.output.Ad;

/**
 * A filter for keeping <code>Ad</code> based of its age expressed in days
 */
public class AdCreationFilter implements AdsFilter
{
	private Date pastDate;
	
	public AdCreationFilter(int days)
	{
		pastDate = Date.from(LocalDateTime.now().minusDays(days).atZone(ZoneId.systemDefault()).toInstant());
	}

	@Override
	public Stream<Ad> filter(Stream<Ad> ads)
	{
		return ads.filter(ad -> ad.getFirstPublicationDate().after(pastDate));
	}
}
