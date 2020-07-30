package info.toyonos.lbc.handler;

import java.util.function.Predicate;

import info.toyonos.lbc.output.Ad;

/**
 * A filter for keeping an <code>Ad</code> or not from LeBonCoin API
 */
public interface AdsFilter extends Predicate<Ad>
{
}