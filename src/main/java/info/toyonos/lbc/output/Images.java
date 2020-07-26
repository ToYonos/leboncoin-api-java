
package info.toyonos.lbc.output;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "thumb_url", "small_url", "nb_images", "urls", "urls_thumb", "urls_large" })
public class Images
{
	@JsonProperty("thumb_url")
	private String thumbUrl;

	@JsonProperty("small_url")
	private String smallUrl;

	@JsonProperty("nb_images")
	private Integer nbImages;

	@JsonProperty("urls")
	private List<String> urls = null;

	@JsonProperty("urls_thumb")
	private List<String> urlsThumb = null;

	@JsonProperty("urls_large")
	private List<String> urlsLarge = null;

	public Images()
	{
	}

	public Images(String thumbUrl, String smallUrl, Integer nbImages, List<String> urls, List<String> urlsThumb, List<String> urlsLarge)
	{
		super();
		this.thumbUrl = thumbUrl;
		this.smallUrl = smallUrl;
		this.nbImages = nbImages;
		this.urls = urls;
		this.urlsThumb = urlsThumb;
		this.urlsLarge = urlsLarge;
	}

	@JsonProperty("thumb_url")
	public String getThumbUrl()
	{
		return thumbUrl;
	}

	@JsonProperty("thumb_url")
	public void setThumbUrl(String thumbUrl)
	{
		this.thumbUrl = thumbUrl;
	}

	@JsonProperty("small_url")
	public String getSmallUrl()
	{
		return smallUrl;
	}

	@JsonProperty("small_url")
	public void setSmallUrl(String smallUrl)
	{
		this.smallUrl = smallUrl;
	}

	@JsonProperty("nb_images")
	public Integer getNbImages()
	{
		return nbImages;
	}

	@JsonProperty("nb_images")
	public void setNbImages(Integer nbImages)
	{
		this.nbImages = nbImages;
	}

	@JsonProperty("urls")
	public List<String> getUrls()
	{
		return urls;
	}

	@JsonProperty("urls")
	public void setUrls(List<String> urls)
	{
		this.urls = urls;
	}

	@JsonProperty("urls_thumb")
	public List<String> getUrlsThumb()
	{
		return urlsThumb;
	}

	@JsonProperty("urls_thumb")
	public void setUrlsThumb(List<String> urlsThumb)
	{
		this.urlsThumb = urlsThumb;
	}

	@JsonProperty("urls_large")
	public List<String> getUrlsLarge()
	{
		return urlsLarge;
	}

	@JsonProperty("urls_large")
	public void setUrlsLarge(List<String> urlsLarge)
	{
		this.urlsLarge = urlsLarge;
	}
}
