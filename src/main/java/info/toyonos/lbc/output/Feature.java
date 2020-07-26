
package info.toyonos.lbc.output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "type", "geometry", "properties" })
public class Feature
{
	@JsonProperty("type")
	private String type;

	@JsonProperty("geometry")
	private Geometry geometry;

	@JsonProperty("properties")
	private Object properties;

	public Feature()
	{
	}

	public Feature(String type, Geometry geometry, Object properties)
	{
		super();
		this.type = type;
		this.geometry = geometry;
		this.properties = properties;
	}

	@JsonProperty("type")
	public String getType()
	{
		return type;
	}

	@JsonProperty("type")
	public void setType(String type)
	{
		this.type = type;
	}

	@JsonProperty("geometry")
	public Geometry getGeometry()
	{
		return geometry;
	}

	@JsonProperty("geometry")
	public void setGeometry(Geometry geometry)
	{
		this.geometry = geometry;
	}

	@JsonProperty("properties")
	public Object getProperties()
	{
		return properties;
	}

	@JsonProperty("properties")
	public void setProperties(Object properties)
	{
		this.properties = properties;
	}
}
