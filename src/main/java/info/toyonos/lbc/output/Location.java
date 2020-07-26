
package info.toyonos.lbc.output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"country_id",
	"region_id",
	"region_name",
	"department_id",
	"department_name",
	"city_label",
	"city",
	"zipcode",
	"lat",
	"lng",
	"source",
	"provider",
	"is_shape",
	"feature" })
public class Location
{
	@JsonProperty("country_id")
	private String countryId;

	@JsonProperty("region_id")
	private String regionId;

	@JsonProperty("region_name")
	private String regionName;

	@JsonProperty("department_id")
	private String departmentId;

	@JsonProperty("department_name")
	private String departmentName;

	@JsonProperty("city_label")
	private String cityLabel;

	@JsonProperty("city")
	private String city;

	@JsonProperty("zipcode")
	private String zipcode;

	@JsonProperty("lat")
	private String lat;

	@JsonProperty("lng")
	private String lng;

	@JsonProperty("source")
	private String source;

	@JsonProperty("provider")
	private String provider;

	@JsonProperty("is_shape")
	private Boolean isShape;

	@JsonProperty("feature")
	private Feature feature;

	public Location()
	{
	}

	public Location(
		String countryId,
		String regionId,
		String regionName,
		String departmentId,
		String departmentName,
		String cityLabel,
		String city,
		String zipcode,
		String lat,
		String lng,
		String source,
		String provider,
		Boolean isShape,
		Feature feature)
	{
		super();
		this.countryId = countryId;
		this.regionId = regionId;
		this.regionName = regionName;
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.cityLabel = cityLabel;
		this.city = city;
		this.zipcode = zipcode;
		this.lat = lat;
		this.lng = lng;
		this.source = source;
		this.provider = provider;
		this.isShape = isShape;
		this.feature = feature;
	}

	@JsonProperty("country_id")
	public String getCountryId()
	{
		return countryId;
	}

	@JsonProperty("country_id")
	public void setCountryId(String countryId)
	{
		this.countryId = countryId;
	}

	@JsonProperty("region_id")
	public String getRegionId()
	{
		return regionId;
	}

	@JsonProperty("region_id")
	public void setRegionId(String regionId)
	{
		this.regionId = regionId;
	}

	@JsonProperty("region_name")
	public String getRegionName()
	{
		return regionName;
	}

	@JsonProperty("region_name")
	public void setRegionName(String regionName)
	{
		this.regionName = regionName;
	}

	@JsonProperty("department_id")
	public String getDepartmentId()
	{
		return departmentId;
	}

	@JsonProperty("department_id")
	public void setDepartmentId(String departmentId)
	{
		this.departmentId = departmentId;
	}

	@JsonProperty("department_name")
	public String getDepartmentName()
	{
		return departmentName;
	}

	@JsonProperty("department_name")
	public void setDepartmentName(String departmentName)
	{
		this.departmentName = departmentName;
	}

	@JsonProperty("city_label")
	public String getCityLabel()
	{
		return cityLabel;
	}

	@JsonProperty("city_label")
	public void setCityLabel(String cityLabel)
	{
		this.cityLabel = cityLabel;
	}

	@JsonProperty("city")
	public String getCity()
	{
		return city;
	}

	@JsonProperty("city")
	public void setCity(String city)
	{
		this.city = city;
	}

	@JsonProperty("zipcode")
	public String getZipcode()
	{
		return zipcode;
	}

	@JsonProperty("zipcode")
	public void setZipcode(String zipcode)
	{
		this.zipcode = zipcode;
	}

	@JsonProperty("lat")
	public String getLat()
	{
		return lat;
	}

	@JsonProperty("lat")
	public void setLat(String lat)
	{
		this.lat = lat;
	}

	@JsonProperty("lng")
	public String getLng()
	{
		return lng;
	}

	@JsonProperty("lng")
	public void setLng(String lng)
	{
		this.lng = lng;
	}

	@JsonProperty("source")
	public String getSource()
	{
		return source;
	}

	@JsonProperty("source")
	public void setSource(String source)
	{
		this.source = source;
	}

	@JsonProperty("provider")
	public String getProvider()
	{
		return provider;
	}

	@JsonProperty("provider")
	public void setProvider(String provider)
	{
		this.provider = provider;
	}

	@JsonProperty("is_shape")
	public Boolean getIsShape()
	{
		return isShape;
	}

	@JsonProperty("is_shape")
	public void setIsShape(Boolean isShape)
	{
		this.isShape = isShape;
	}

	@JsonProperty("feature")
	public Feature getFeature()
	{
		return feature;
	}

	@JsonProperty("feature")
	public void setFeature(Feature feature)
	{
		this.feature = feature;
	}
}
