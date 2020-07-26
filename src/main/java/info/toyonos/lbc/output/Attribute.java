
package info.toyonos.lbc.output;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "key", "value", "values", "value_label", "generic", "key_label" })
public class Attribute
{
	@JsonProperty("key")
	private String key;

	@JsonProperty("value")
	private String value;

	@JsonProperty("values")
	private List<String> values = null;

	@JsonProperty("value_label")
	private String valueLabel;

	@JsonProperty("generic")
	private Boolean generic;

	@JsonProperty("key_label")
	private String keyLabel;

	public Attribute()
	{
	}

	public Attribute(String key, String value, List<String> values, String valueLabel, Boolean generic, String keyLabel)
	{
		super();
		this.key = key;
		this.value = value;
		this.values = values;
		this.valueLabel = valueLabel;
		this.generic = generic;
		this.keyLabel = keyLabel;
	}

	@JsonProperty("key")
	public String getKey()
	{
		return key;
	}

	@JsonProperty("key")
	public void setKey(String key)
	{
		this.key = key;
	}

	@JsonProperty("value")
	public String getValue()
	{
		return value;
	}

	@JsonProperty("value")
	public void setValue(String value)
	{
		this.value = value;
	}

	@JsonProperty("values")
	public List<String> getValues()
	{
		return values;
	}

	@JsonProperty("values")
	public void setValues(List<String> values)
	{
		this.values = values;
	}

	@JsonProperty("value_label")
	public String getValueLabel()
	{
		return valueLabel;
	}

	@JsonProperty("value_label")
	public void setValueLabel(String valueLabel)
	{
		this.valueLabel = valueLabel;
	}

	@JsonProperty("generic")
	public Boolean getGeneric()
	{
		return generic;
	}

	@JsonProperty("generic")
	public void setGeneric(Boolean generic)
	{
		this.generic = generic;
	}

	@JsonProperty("key_label")
	public String getKeyLabel()
	{
		return keyLabel;
	}

	@JsonProperty("key_label")
	public void setKeyLabel(String keyLabel)
	{
		this.keyLabel = keyLabel;
	}
}
