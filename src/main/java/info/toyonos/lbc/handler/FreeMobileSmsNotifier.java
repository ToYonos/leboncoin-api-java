package info.toyonos.lbc.handler;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

/**
 * A SMS notifier using Free Mobile SMS API
 * @see https://www.universfreebox.com/article/26337/Nouveau-Free-Mobile-lance-un-systeme-de-notification-SMS-pour-vos-appareils-connectes
 */
public class FreeMobileSmsNotifier extends SmsNotifier
{
	private WebTarget smsWt;
	
	public FreeMobileSmsNotifier(String user, String pass)
	{	
		smsWt = ClientBuilder.newClient()
		.target("https://smsapi.free-mobile.fr")
		.path("sendmsg")
		.queryParam("user", user)
		.queryParam("pass", pass);
	}

	@Override
	void send(String msg)
	{
		smsWt.queryParam("msg", msg).request().get();
	}
}
