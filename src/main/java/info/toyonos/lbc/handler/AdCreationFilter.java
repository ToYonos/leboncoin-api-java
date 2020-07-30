package info.toyonos.lbc.handler;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

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
	public boolean test(Ad ad)
	{
		return ad.getFirstPublicationDate().after(pastDate);
	}
}
