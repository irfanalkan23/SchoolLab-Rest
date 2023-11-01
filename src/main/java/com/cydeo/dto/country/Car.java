
package com.cydeo.dto.country;

import java.util.LinkedHashMap;
import java.util.List;
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
    "signs",
    "side"
})
@Generated("jsonschema2pojo")
public class Car {

    @JsonProperty("signs")
    private List<String> signs;
    @JsonProperty("side")
    private String side;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("signs")
    public List<String> getSigns() {
        return signs;
    }

    @JsonProperty("signs")
    public void setSigns(List<String> signs) {
        this.signs = signs;
    }

    @JsonProperty("side")
    public String getSide() {
        return side;
    }

    @JsonProperty("side")
    public void setSide(String side) {
        this.side = side;
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
