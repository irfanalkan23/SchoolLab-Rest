
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
    "common",
    "official",
    "nativeName"
})
@Generated("jsonschema2pojo")
public class Name {

    @JsonProperty("common")
    private String common;
    @JsonProperty("official")
    private String official;
    @JsonProperty("nativeName")
    private NativeName nativeName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("common")
    public String getCommon() {
        return common;
    }

    @JsonProperty("common")
    public void setCommon(String common) {
        this.common = common;
    }

    @JsonProperty("official")
    public String getOfficial() {
        return official;
    }

    @JsonProperty("official")
    public void setOfficial(String official) {
        this.official = official;
    }

    @JsonProperty("nativeName")
    public NativeName getNativeName() {
        return nativeName;
    }

    @JsonProperty("nativeName")
    public void setNativeName(NativeName nativeName) {
        this.nativeName = nativeName;
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
