
package info.toyonos.lbc.output;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"ads_shippable"})
@JsonPropertyOrder({
	"total",
	"total_all",
	"total_pro",
	"total_private",
	"total_active",
	"total_inactive",
	"total_shippable",
	"max_pages",
	"referrer_id",
	"pivot",
	"ads",
	"applied_condition" })
public class SearchResult
{
	@JsonProperty("total")
	private Integer total;

	@JsonProperty("total_all")
	private Integer totalAll;

	@JsonProperty("total_pro")
	private Integer totalPro;

	@JsonProperty("total_private")
	private Integer totalPrivate;

	@JsonProperty("total_active")
	private Integer totalActive;

	@JsonProperty("total_inactive")
	private Integer totalInactive;

	@JsonProperty("total_shippable")
	private Integer totalShippable;

	@JsonProperty("max_pages")
	private Integer maxPages;

	@JsonProperty("referrer_id")
	private String referrerId;

	@JsonProperty("pivot")
	private String pivot;

	@JsonProperty("ads")
	private List<Ad> ads = null;

	@JsonProperty("applied_condition")
	private String appliedCondition;

	public SearchResult()
	{
	}

	public SearchResult(
		Integer total,
		Integer totalAll,
		Integer totalPro,
		Integer totalPrivate,
		Integer totalActive,
		Integer totalInactive,
		Integer totalShippable,
		Integer maxPages,
		String referrerId,
		String pivot,
		List<Ad> ads,
		String appliedCondition)
	{
		super();
		this.total = total;
		this.totalAll = totalAll;
		this.totalPro = totalPro;
		this.totalPrivate = totalPrivate;
		this.totalActive = totalActive;
		this.totalInactive = totalInactive;
		this.totalShippable = totalShippable;
		this.maxPages = maxPages;
		this.referrerId = referrerId;
		this.pivot = pivot;
		this.ads = ads;
		this.appliedCondition = appliedCondition;
	}

	@JsonProperty("total")
	public Integer getTotal()
	{
		return total;
	}

	@JsonProperty("total")
	public void setTotal(Integer total)
	{
		this.total = total;
	}

	@JsonProperty("total_all")
	public Integer getTotalAll()
	{
		return totalAll;
	}

	@JsonProperty("total_all")
	public void setTotalAll(Integer totalAll)
	{
		this.totalAll = totalAll;
	}

	@JsonProperty("total_pro")
	public Integer getTotalPro()
	{
		return totalPro;
	}

	@JsonProperty("total_pro")
	public void setTotalPro(Integer totalPro)
	{
		this.totalPro = totalPro;
	}

	@JsonProperty("total_private")
	public Integer getTotalPrivate()
	{
		return totalPrivate;
	}

	@JsonProperty("total_private")
	public void setTotalPrivate(Integer totalPrivate)
	{
		this.totalPrivate = totalPrivate;
	}

	@JsonProperty("total_active")
	public Integer getTotalActive()
	{
		return totalActive;
	}

	@JsonProperty("total_active")
	public void setTotalActive(Integer totalActive)
	{
		this.totalActive = totalActive;
	}

	@JsonProperty("total_inactive")
	public Integer getTotalInactive()
	{
		return totalInactive;
	}

	@JsonProperty("total_inactive")
	public void setTotalInactive(Integer totalInactive)
	{
		this.totalInactive = totalInactive;
	}

	@JsonProperty("total_shippable")
	public Integer getTotalShippable()
	{
		return totalShippable;
	}

	@JsonProperty("total_shippable")
	public void setTotalShippable(Integer totalShippable)
	{
		this.totalShippable = totalShippable;
	}

	@JsonProperty("max_pages")
	public Integer getMaxPages()
	{
		return maxPages;
	}

	@JsonProperty("max_pages")
	public void setMaxPages(Integer maxPages)
	{
		this.maxPages = maxPages;
	}

	@JsonProperty("referrer_id")
	public String getReferrerId()
	{
		return referrerId;
	}

	@JsonProperty("referrer_id")
	public void setReferrerId(String referrerId)
	{
		this.referrerId = referrerId;
	}

	@JsonProperty("pivot")
	public String getPivot()
	{
		return pivot;
	}

	@JsonProperty("pivot")
	public void setPivot(String pivot)
	{
		this.pivot = pivot;
	}

	@JsonProperty("ads")
	public List<Ad> getAds()
	{
		return ads;
	}

	@JsonProperty("ads")
	public void setAds(List<Ad> ads)
	{
		this.ads = ads;
	}

	@JsonProperty("applied_condition")
	public String getAppliedCondition()
	{
		return appliedCondition;
	}

	@JsonProperty("applied_condition")
	public void setAppliedCondition(String appliedCondition)
	{
		this.appliedCondition = appliedCondition;
	}
}
