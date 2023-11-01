
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
    "root",
    "suffixes"
})
@Generated("jsonschema2pojo")
public class Idd {

    @JsonProperty("root")
    private String root;
    @JsonProperty("suffixes")
    private List<String> suffixes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("root")
    public String getRoot() {
        return root;
    }

    @JsonProperty("root")
    public void setRoot(String root) {
        this.root = root;
    }

    @JsonProperty("suffixes")
    public List<String> getSuffixes() {
        return suffixes;
    }

    @JsonProperty("suffixes")
    public void setSuffixes(List<String> suffixes) {
        this.suffixes = suffixes;
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
