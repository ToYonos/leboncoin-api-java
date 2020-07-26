
package info.toyonos.lbc.output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "store_id", "user_id", "type", "name", "no_salesmen", "siren", "pro_rates_link"})
public class Owner
{
	@JsonProperty("store_id")
	private String storeId;

	@JsonProperty("user_id")
	private String userId;

	@JsonProperty("type")
	private String type;

	@JsonProperty("name")
	private String name;

	@JsonProperty("no_salesmen")
	private Boolean noSalesmen;

	@JsonProperty("siren")
	private String siren;

	@JsonProperty("pro_rates_link")
	private String proRatesLink;
	

	public Owner()
	{
	}

	public Owner(String storeId, String userId, String type, String name, Boolean noSalesmen, String siren, String proRatesLink)
	{
		super();
		this.storeId = storeId;
		this.userId = userId;
		this.type = type;
		this.name = name;
		this.noSalesmen = noSalesmen;
		this.siren = siren;
		this.proRatesLink = proRatesLink;
	}

	public String getStoreId()
	{
		return storeId;
	}

	public void setStoreId(String storeId)
	{
		this.storeId = storeId;
	}

	public String getUserId()
	{
		return userId;
	}

	public void setUserId(String userId)
	{
		this.userId = userId;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Boolean getNoSalesmen()
	{
		return noSalesmen;
	}

	public void setNoSalesmen(Boolean noSalesmen)
	{
		this.noSalesmen = noSalesmen;
	}

	public String getSiren()
	{
		return siren;
	}

	public void setSiren(String siren)
	{
		this.siren = siren;
	}

	public String getProRatesLink()
	{
		return proRatesLink;
	}

	public void setProRatesLink(String proRatesLink)
	{
		this.proRatesLink = proRatesLink;
	}
}
