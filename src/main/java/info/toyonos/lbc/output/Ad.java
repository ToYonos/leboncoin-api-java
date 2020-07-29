
package info.toyonos.lbc.output;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"vacation_calendar"})
@JsonPropertyOrder({
	"list_id",
	"first_publication_date",
	"index_date",
	"status",
	"category_id",
	"category_name",
	"subject",
	"body",
	"ad_type",
	"url",
	"price",
	"price_calendar",
	"images",
	"attributes",
	"location",
	"owner",
	"options",
	"has_phone",
	"expiration_date" })
public class Ad
{
	private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

	@JsonProperty("list_id")
	private Integer listId;

	@JsonProperty("first_publication_date")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Ad.DATE_FORMAT, timezone = "Europe/Paris")
	private Date firstPublicationDate;

	@JsonProperty("index_date")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Ad.DATE_FORMAT, timezone = "Europe/Paris")
	private Date indexDate;

	@JsonProperty("status")
	private String status;

	@JsonProperty("category_id")
	private String categoryId;

	@JsonProperty("category_name")
	private String categoryName;

	@JsonProperty("subject")
	private String subject;

	@JsonProperty("body")
	private String body;

	@JsonProperty("ad_type")
	private String adType;

	@JsonProperty("url")
	private String url;

	@JsonProperty("price")
	private List<Integer> price = null;

	@JsonProperty("price_calendar")
	private Object priceCalendar;

	@JsonProperty("images")
	private Images images;

	@JsonProperty("attributes")
	private List<Attribute> attributes = null;

	@JsonProperty("location")
	private Location location;

	@JsonProperty("owner")
	private Owner owner;

	@JsonProperty("options")
	private Options options;

	@JsonProperty("has_phone")
	private Boolean hasPhone;

	@JsonProperty("expiration_date")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Ad.DATE_FORMAT, timezone = "Europe/Paris")
	private Date expirationDate;

	public Ad()
	{
	}

	public Ad(
		Integer listId,
		Date firstPublicationDate,
		Date indexDate,
		String status,
		String categoryId,
		String categoryName,
		String subject,
		String body,
		String adType,
		String url,
		List<Integer> price,
		Object priceCalendar,
		Images images,
		List<Attribute> attributes,
		Location location,
		Owner owner,
		Options options,
		Boolean hasPhone,
		Date expirationDate)
	{
		super();
		this.listId = listId;
		this.firstPublicationDate = firstPublicationDate;
		this.indexDate = indexDate;
		this.status = status;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.subject = subject;
		this.body = body;
		this.adType = adType;
		this.url = url;
		this.price = price;
		this.priceCalendar = priceCalendar;
		this.images = images;
		this.attributes = attributes;
		this.location = location;
		this.owner = owner;
		this.options = options;
		this.hasPhone = hasPhone;
		this.expirationDate = expirationDate;
	}

	@JsonProperty("list_id")
	public Integer getListId()
	{
		return listId;
	}

	@JsonProperty("list_id")
	public void setListId(Integer listId)
	{
		this.listId = listId;
	}

	@JsonProperty("first_publication_date")
	public Date getFirstPublicationDate()
	{
		return firstPublicationDate;
	}

	@JsonProperty("first_publication_date")
	public void setFirstPublicationDate(Date firstPublicationDate)
	{
		this.firstPublicationDate = firstPublicationDate;
	}

	@JsonProperty("index_date")
	public Date getIndexDate()
	{
		return indexDate;
	}

	@JsonProperty("index_date")
	public void setIndexDate(Date indexDate)
	{
		this.indexDate = indexDate;
	}

	@JsonProperty("status")
	public String getStatus()
	{
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status)
	{
		this.status = status;
	}

	@JsonProperty("category_id")
	public String getCategoryId()
	{
		return categoryId;
	}

	@JsonProperty("category_id")
	public void setCategoryId(String categoryId)
	{
		this.categoryId = categoryId;
	}

	@JsonProperty("category_name")
	public String getCategoryName()
	{
		return categoryName;
	}

	@JsonProperty("category_name")
	public void setCategoryName(String categoryName)
	{
		this.categoryName = categoryName;
	}

	@JsonProperty("subject")
	public String getSubject()
	{
		return subject;
	}

	@JsonProperty("subject")
	public void setSubject(String subject)
	{
		this.subject = subject;
	}

	@JsonProperty("body")
	public String getBody()
	{
		return body;
	}

	@JsonProperty("body")
	public void setBody(String body)
	{
		this.body = body;
	}

	@JsonProperty("ad_type")
	public String getAdType()
	{
		return adType;
	}

	@JsonProperty("ad_type")
	public void setAdType(String adType)
	{
		this.adType = adType;
	}

	@JsonProperty("url")
	public String getUrl()
	{
		return url;
	}

	@JsonProperty("url")
	public void setUrl(String url)
	{
		this.url = url;
	}

	@JsonProperty("price")
	public List<Integer> getPrice()
	{
		return price;
	}

	@JsonProperty("price")
	public void setPrice(List<Integer> price)
	{
		this.price = price;
	}

	@JsonProperty("price_calendar")
	public Object getPriceCalendar()
	{
		return priceCalendar;
	}

	@JsonProperty("price_calendar")
	public void setPriceCalendar(Object priceCalendar)
	{
		this.priceCalendar = priceCalendar;
	}

	@JsonProperty("images")
	public Images getImages()
	{
		return images;
	}

	@JsonProperty("images")
	public void setImages(Images images)
	{
		this.images = images;
	}

	@JsonProperty("attributes")
	public List<Attribute> getAttributes()
	{
		return attributes;
	}

	@JsonProperty("attributes")
	public void setAttributes(List<Attribute> attributes)
	{
		this.attributes = attributes;
	}

	@JsonProperty("location")
	public Location getLocation()
	{
		return location;
	}

	@JsonProperty("location")
	public void setLocation(Location location)
	{
		this.location = location;
	}

	@JsonProperty("owner")
	public Owner getOwner()
	{
		return owner;
	}

	@JsonProperty("owner")
	public void setOwner(Owner owner)
	{
		this.owner = owner;
	}

	@JsonProperty("options")
	public Options getOptions()
	{
		return options;
	}

	@JsonProperty("options")
	public void setOptions(Options options)
	{
		this.options = options;
	}

	@JsonProperty("has_phone")
	public Boolean getHasPhone()
	{
		return hasPhone;
	}

	@JsonProperty("has_phone")
	public void setHasPhone(Boolean hasPhone)
	{
		this.hasPhone = hasPhone;
	}

	@JsonProperty("expiration_date")
	public Date getExpirationDate()
	{
		return expirationDate;
	}

	@JsonProperty("expiration_date")
	public void setExpirationDate(Date expirationDate)
	{
		this.expirationDate = expirationDate;
	}
}
