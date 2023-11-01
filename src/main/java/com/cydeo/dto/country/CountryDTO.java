
package com.cydeo.dto.country;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "tld",
    "cca2",
    "ccn3",
    "cca3",
    "cioc",
    "independent",
    "status",
    "unMember",
    "currencies",
    "idd",
    "capital",
    "altSpellings",
    "region",
    "subregion",
    "languages",
    "translations",
    "latlng",
    "landlocked",
    "borders",
    "area",
    "demonyms",
    "flag",
    "maps",
    "population",
    "gini",
    "fifa",
    "car",
    "timezones",
    "continents",
    "flags",
    "coatOfArms",
    "startOfWeek",
    "capitalInfo",
    "postalCode"
})
@Generated("jsonschema2pojo")
public class CountryDTO {

    @JsonProperty("name")
    private Name name;
    @JsonProperty("tld")
    private List<String> tld;
    @JsonProperty("cca2")
    private String cca2;
    @JsonProperty("ccn3")
    private String ccn3;
    @JsonProperty("cca3")
    private String cca3;
    @JsonProperty("cioc")
    private String cioc;
    @JsonProperty("independent")
    private Boolean independent;
    @JsonProperty("status")
    private String status;
    @JsonProperty("unMember")
    private Boolean unMember;
    @JsonProperty("currencies")
    private Currencies currencies;
    @JsonProperty("idd")
    private Idd idd;
    @JsonProperty("capital")
    private List<String> capital;
    @JsonProperty("altSpellings")
    private List<String> altSpellings;
    @JsonProperty("region")
    private String region;
    @JsonProperty("subregion")
    private String subregion;
    @JsonProperty("languages")
    private Languages languages;
    @JsonProperty("translations")
    private Translations translations;
    @JsonProperty("latlng")
    private List<Double> latlng;
    @JsonProperty("landlocked")
    private Boolean landlocked;
    @JsonProperty("borders")
    private List<String> borders;
    @JsonProperty("area")
    private Double area;
    @JsonProperty("demonyms")
    private Demonyms demonyms;
    @JsonProperty("flag")
    private String flag;
    @JsonProperty("maps")
    private Maps maps;
    @JsonProperty("population")
    private Integer population;
    @JsonProperty("gini")
    private Gini gini;
    @JsonProperty("fifa")
    private String fifa;
    @JsonProperty("car")
    private Car car;
    @JsonProperty("timezones")
    private List<String> timezones;
    @JsonProperty("continents")
    private List<String> continents;
    @JsonProperty("flags")
    private Flags flags;
    @JsonProperty("coatOfArms")
    private CoatOfArms coatOfArms;
    @JsonProperty("startOfWeek")
    private String startOfWeek;
    @JsonProperty("capitalInfo")
    private CapitalInfo capitalInfo;
    @JsonProperty("postalCode")
    private PostalCode postalCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    @JsonProperty("tld")
    public List<String> getTld() {
        return tld;
    }

    @JsonProperty("tld")
    public void setTld(List<String> tld) {
        this.tld = tld;
    }

    @JsonProperty("cca2")
    public String getCca2() {
        return cca2;
    }

    @JsonProperty("cca2")
    public void setCca2(String cca2) {
        this.cca2 = cca2;
    }

    @JsonProperty("ccn3")
    public String getCcn3() {
        return ccn3;
    }

    @JsonProperty("ccn3")
    public void setCcn3(String ccn3) {
        this.ccn3 = ccn3;
    }

    @JsonProperty("cca3")
    public String getCca3() {
        return cca3;
    }

    @JsonProperty("cca3")
    public void setCca3(String cca3) {
        this.cca3 = cca3;
    }

    @JsonProperty("cioc")
    public String getCioc() {
        return cioc;
    }

    @JsonProperty("cioc")
    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

    @JsonProperty("independent")
    public Boolean getIndependent() {
        return independent;
    }

    @JsonProperty("independent")
    public void setIndependent(Boolean independent) {
        this.independent = independent;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("unMember")
    public Boolean getUnMember() {
        return unMember;
    }

    @JsonProperty("unMember")
    public void setUnMember(Boolean unMember) {
        this.unMember = unMember;
    }

    @JsonProperty("currencies")
    public Currencies getCurrencies() {
        return currencies;
    }

    @JsonProperty("currencies")
    public void setCurrencies(Currencies currencies) {
        this.currencies = currencies;
    }

    @JsonProperty("idd")
    public Idd getIdd() {
        return idd;
    }

    @JsonProperty("idd")
    public void setIdd(Idd idd) {
        this.idd = idd;
    }

    @JsonProperty("capital")
    public List<String> getCapital() {
        return capital;
    }

    @JsonProperty("capital")
    public void setCapital(List<String> capital) {
        this.capital = capital;
    }

    @JsonProperty("altSpellings")
    public List<String> getAltSpellings() {
        return altSpellings;
    }

    @JsonProperty("altSpellings")
    public void setAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("subregion")
    public String getSubregion() {
        return subregion;
    }

    @JsonProperty("subregion")
    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    @JsonProperty("languages")
    public Languages getLanguages() {
        return languages;
    }

    @JsonProperty("languages")
    public void setLanguages(Languages languages) {
        this.languages = languages;
    }

    @JsonProperty("translations")
    public Translations getTranslations() {
        return translations;
    }

    @JsonProperty("translations")
    public void setTranslations(Translations translations) {
        this.translations = translations;
    }

    @JsonProperty("latlng")
    public List<Double> getLatlng() {
        return latlng;
    }

    @JsonProperty("latlng")
    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }

    @JsonProperty("landlocked")
    public Boolean getLandlocked() {
        return landlocked;
    }

    @JsonProperty("landlocked")
    public void setLandlocked(Boolean landlocked) {
        this.landlocked = landlocked;
    }

    @JsonProperty("borders")
    public List<String> getBorders() {
        return borders;
    }

    @JsonProperty("borders")
    public void setBorders(List<String> borders) {
        this.borders = borders;
    }

    @JsonProperty("area")
    public Double getArea() {
        return area;
    }

    @JsonProperty("area")
    public void setArea(Double area) {
        this.area = area;
    }

    @JsonProperty("demonyms")
    public Demonyms getDemonyms() {
        return demonyms;
    }

    @JsonProperty("demonyms")
    public void setDemonyms(Demonyms demonyms) {
        this.demonyms = demonyms;
    }

    @JsonProperty("flag")
    public String getFlag() {
        return flag;
    }

    @JsonProperty("flag")
    public void setFlag(String flag) {
        this.flag = flag;
    }

    @JsonProperty("maps")
    public Maps getMaps() {
        return maps;
    }

    @JsonProperty("maps")
    public void setMaps(Maps maps) {
        this.maps = maps;
    }

    @JsonProperty("population")
    public Integer getPopulation() {
        return population;
    }

    @JsonProperty("population")
    public void setPopulation(Integer population) {
        this.population = population;
    }

    @JsonProperty("gini")
    public Gini getGini() {
        return gini;
    }

    @JsonProperty("gini")
    public void setGini(Gini gini) {
        this.gini = gini;
    }

    @JsonProperty("fifa")
    public String getFifa() {
        return fifa;
    }

    @JsonProperty("fifa")
    public void setFifa(String fifa) {
        this.fifa = fifa;
    }

    @JsonProperty("car")
    public Car getCar() {
        return car;
    }

    @JsonProperty("car")
    public void setCar(Car car) {
        this.car = car;
    }

    @JsonProperty("timezones")
    public List<String> getTimezones() {
        return timezones;
    }

    @JsonProperty("timezones")
    public void setTimezones(List<String> timezones) {
        this.timezones = timezones;
    }

    @JsonProperty("continents")
    public List<String> getContinents() {
        return continents;
    }

    @JsonProperty("continents")
    public void setContinents(List<String> continents) {
        this.continents = continents;
    }

    @JsonProperty("flags")
    public Flags getFlags() {
        return flags;
    }

    @JsonProperty("flags")
    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    @JsonProperty("coatOfArms")
    public CoatOfArms getCoatOfArms() {
        return coatOfArms;
    }

    @JsonProperty("coatOfArms")
    public void setCoatOfArms(CoatOfArms coatOfArms) {
        this.coatOfArms = coatOfArms;
    }

    @JsonProperty("startOfWeek")
    public String getStartOfWeek() {
        return startOfWeek;
    }

    @JsonProperty("startOfWeek")
    public void setStartOfWeek(String startOfWeek) {
        this.startOfWeek = startOfWeek;
    }

    @JsonProperty("capitalInfo")
    public CapitalInfo getCapitalInfo() {
        return capitalInfo;
    }

    @JsonProperty("capitalInfo")
    public void setCapitalInfo(CapitalInfo capitalInfo) {
        this.capitalInfo = capitalInfo;
    }

    @JsonProperty("postalCode")
    public PostalCode getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(PostalCode postalCode) {
        this.postalCode = postalCode;
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
