
package com.cydeo.dto.country;

import java.util.LinkedHashMap;
import java.util.Map;
import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "png",
    "svg",
    "alt"
})
@Generated("jsonschema2pojo")
public class Flags {

    @JsonProperty("png")
    private String png;
    @JsonProperty("svg")
    private String svg;
    @JsonProperty("alt")
    private String alt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("png")
    public String getPng() {
        return png;
    }

    @JsonProperty("png")
    public void setPng(String png) {
        this.png = png;
    }

    @JsonProperty("svg")
    public String getSvg() {
        return svg;
    }

    @JsonProperty("svg")
    public void setSvg(String svg) {
        this.svg = svg;
    }

    @JsonProperty("alt")
    public String getAlt() {
        return alt;
    }

    @JsonProperty("alt")
    public void setAlt(String alt) {
        this.alt = alt;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
