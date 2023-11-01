
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
    "googleMaps",
    "openStreetMaps"
})
@Generated("jsonschema2pojo")
public class Maps {

    @JsonProperty("googleMaps")
    private String googleMaps;
    @JsonProperty("openStreetMaps")
    private String openStreetMaps;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("googleMaps")
    public String getGoogleMaps() {
        return googleMaps;
    }

    @JsonProperty("googleMaps")
    public void setGoogleMaps(String googleMaps) {
        this.googleMaps = googleMaps;
    }

    @JsonProperty("openStreetMaps")
    public String getOpenStreetMaps() {
        return openStreetMaps;
    }

    @JsonProperty("openStreetMaps")
    public void setOpenStreetMaps(String openStreetMaps) {
        this.openStreetMaps = openStreetMaps;
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
