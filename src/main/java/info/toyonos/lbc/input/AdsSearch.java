package info.toyonos.lbc.input;

import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AdsSearch
{
	private int limit;
	private int offset;
	private String owerType;
	private String sortBy;
	private SortOrder sortOrder;

	private Filters filters;
	
	public enum SortOrder { ASC, DESC }
	
	public AdsSearch(int limit, int offset, String owerType, String sortBy, SortOrder sortOrder, String keywords, double lat, double lng, int radius)
	{
		this.limit = limit;
		this.offset = offset;
		this.owerType = owerType;
		this.sortBy = sortBy;
		this.sortOrder = sortOrder;
		this.filters = new Filters();
		this.filters.enums.put("ad_type", Arrays.asList("offer"));
		this.filters.keywords.put("text", keywords);
		this.filters.location.put("area", Stream.of(
			new SimpleEntry<String, Double>("lat", lat),
			new SimpleEntry<String, Double>("lng", lng),
			new SimpleEntry<String, Integer>("radius", radius)
		).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
	}

	public int getLimit()
	{
		return limit;
	}

	public void setLimit(int limit)
	{
		this.limit = limit;
	}

	public int getOffset()
	{
		return offset;
	}

	public void setOffset(int offset)
	{
		this.offset = offset;
	}

	public String getOwerType()
	{
		return owerType;
	}

	public void setOwerType(String owerType)
	{
		this.owerType = owerType;
	}

	public String getSortBy()
	{
		return sortBy;
	}

	public void setSortBy(String sortBy)
	{
		this.sortBy = sortBy;
	}

	public SortOrder getSortOrder()
	{
		return sortOrder;
	}

	public void setSortOrder(SortOrder sortOrder)
	{
		this.sortOrder = sortOrder;
	}

	public Filters getFilters()
	{
		return filters;
	}

	public void setFilters(Filters filters)
	{
		this.filters = filters;
	}

	public class Filters
	{
		private Map<String, Object> enums = new HashMap<>();
		private Map<String, Object> keywords = new HashMap<>();
		private Map<String, Object> location = new HashMap<>();

		public Map<String, Object> getEnums()
		{
			return enums;
		}

		public void setEnums(Map<String, Object> enums)
		{
			this.enums = enums;
		}

		public Map<String, Object> getKeywords()
		{
			return keywords;
		}

		public void setKeywords(Map<String, Object> keywords)
		{
			this.keywords = keywords;
		}

		public Map<String, Object> getLocation()
		{
			return location;
		}

		public void setLocation(Map<String, Object> location)
		{
			this.location = location;
		}
	}
}

//"{"
//+ "\"limit\": 10,"
//+ "\"filters\": {"
//	+ "\"enums\" : { \"ad_type\": [\"offer\"] },"
//	+ "\"location\": {\"area\" : {\"lat\": 47.214650, \"lng\": -1.547044, \"radius\": 10000}},"
//	+ "\"keywords\": {\"text\":\"mario kart switch\"},"
//	+ "\"ranges\": null"
//+ "},"
//+ "\"offset\": 0,"
//+ "\"owner_type\": null,"
//+ "\"sort_by\": \"date\","
//+ "\"sort_order\": \"desc\""
//+ "}",