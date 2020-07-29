package info.toyonos.lbc.handler;

import java.util.stream.Stream;

import info.toyonos.lbc.output.Ad;

/**
 * A filter for reducing a <code>Stream</code> of <code>Ad</code> from LeBonCoin API
 */
public interface AdsFilter
{
	public Stream<Ad> filter(Stream<Ad> ads);
}