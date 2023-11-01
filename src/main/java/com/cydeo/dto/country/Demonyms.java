
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
    "eng",
    "fra"
})
@Generated("jsonschema2pojo")
public class Demonyms {

    @JsonProperty("eng")
    private Eng eng;
    @JsonProperty("fra")
    private Fra__1 fra;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("eng")
    public Eng getEng() {
        return eng;
    }

    @JsonProperty("eng")
    public void setEng(Eng eng) {
        this.eng = eng;
    }

    @JsonProperty("fra")
    public Fra__1 getFra() {
        return fra;
    }

    @JsonProperty("fra")
    public void setFra(Fra__1 fra) {
        this.fra = fra;
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
