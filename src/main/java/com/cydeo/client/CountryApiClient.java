package com.cydeo.client;

import com.cydeo.dto.country.CountryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "https://restcountries.com/v3.1",name = "FLAG-CLIENT")
public interface CountryApiClient {
    //https://restcountries.com/v3.1/name/Finland
    //no authorization / access key required in restcountries

    @GetMapping("/name/{countryName}")
    List<CountryDTO> getCountryInfo(@PathVariable("countryName") String countryName);
    //List<CountryDTO> instead of CountryDTO, because restcountries api is returning ARRAY of json instead of json

}
