package info.toyonos.lbc.handler;

import java.util.stream.Stream;

import info.toyonos.lbc.output.Ad;

/**
 * A handler for dealing with a <code>Stream</code> of <code>Ad</code> from LeBonCoin API
 */
public interface AdsHandler
{
	public void handle(Stream<Ad> ads);
}