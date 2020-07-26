
package info.toyonos.lbc.output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "has_option", "booster", "photosup", "urgent", "gallery", "sub_toplist" })
public class Options
{

	@JsonProperty("has_option")
	private Boolean hasOption;

	@JsonProperty("booster")
	private Boolean booster;

	@JsonProperty("photosup")
	private Boolean photosup;

	@JsonProperty("urgent")
	private Boolean urgent;

	@JsonProperty("gallery")
	private Boolean gallery;

	@JsonProperty("sub_toplist")
	private Boolean subToplist;

	public Options()
	{
	}

	public Options(Boolean hasOption, Boolean booster, Boolean photosup, Boolean urgent, Boolean gallery, Boolean subToplist)
	{
		super();
		this.hasOption = hasOption;
		this.booster = booster;
		this.photosup = photosup;
		this.urgent = urgent;
		this.gallery = gallery;
		this.subToplist = subToplist;
	}

	@JsonProperty("has_option")
	public Boolean getHasOption()
	{
		return hasOption;
	}

	@JsonProperty("has_option")
	public void setHasOption(Boolean hasOption)
	{
		this.hasOption = hasOption;
	}

	@JsonProperty("booster")
	public Boolean getBooster()
	{
		return booster;
	}

	@JsonProperty("booster")
	public void setBooster(Boolean booster)
	{
		this.booster = booster;
	}

	@JsonProperty("photosup")
	public Boolean getPhotosup()
	{
		return photosup;
	}

	@JsonProperty("photosup")
	public void setPhotosup(Boolean photosup)
	{
		this.photosup = photosup;
	}

	@JsonProperty("urgent")
	public Boolean getUrgent()
	{
		return urgent;
	}

	@JsonProperty("urgent")
	public void setUrgent(Boolean urgent)
	{
		this.urgent = urgent;
	}

	@JsonProperty("gallery")
	public Boolean getGallery()
	{
		return gallery;
	}

	@JsonProperty("gallery")
	public void setGallery(Boolean gallery)
	{
		this.gallery = gallery;
	}

	@JsonProperty("sub_toplist")
	public Boolean getSubToplist()
	{
		return subToplist;
	}

	@JsonProperty("sub_toplist")
	public void setSubToplist(Boolean subToplist)
	{
		this.subToplist = subToplist;
	}
}
