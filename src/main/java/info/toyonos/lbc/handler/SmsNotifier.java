package info.toyonos.lbc.handler;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import info.toyonos.lbc.output.Ad;

/**
 * A SMS notifier for sending ads by SMS
 * @see https://www.universfreebox.com/article/26337/Nouveau-Free-Mobile-lance-un-systeme-de-notification-SMS-pour-vos-appareils-connectes
 */
public abstract class SmsNotifier implements AdsHandler
{
	@Override
	public void handle(Stream<Ad> ads)
	{
		send(ads.map(ad ->
		{
			StringBuilder sb = new StringBuilder();
			sb.append(ad.getFirstPublicationDate() + " -> " + ad.getSubject() + " : " + ad.getPrice() + "\n");
			sb.append(ad.getUrl() + "\n");
			return sb.toString();
		})
		.collect(Collectors.joining("\n")));
	}

	abstract void send(String msg);
}
