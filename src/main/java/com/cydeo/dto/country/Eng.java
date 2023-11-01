
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
    "f",
    "m"
})
@Generated("jsonschema2pojo")
public class Eng {

    @JsonProperty("f")
    private String f;
    @JsonProperty("m")
    private String m;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("f")
    public String getF() {
        return f;
    }

    @JsonProperty("f")
    public void setF(String f) {
        this.f = f;
    }

    @JsonProperty("m")
    public String getM() {
        return m;
    }

    @JsonProperty("m")
    public void setM(String m) {
        this.m = m;
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
