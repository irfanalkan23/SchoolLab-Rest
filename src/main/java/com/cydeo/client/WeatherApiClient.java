package com.cydeo.client;

import com.cydeo.dto.weather.WeatherDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "http://api.weatherstack.com",name = "WEATHER-CLIENT")
public interface WeatherApiClient {
    // http://api.weatherstack.com --> url
    // /current --> endpoint
    // ?access_key=4f09784466618470ffecee4eaa210ebc
    // &
    // query=New York

    @GetMapping("/current")
    WeatherDTO getCurrentWeather(@RequestParam(value = "access_key") String accessKey,
                                 @RequestParam(value = "query") String city);

    /* this method, with FeignClient, will return WeatherDTO that I will create as below:
    - how to deserialize from JSON to Java? json to pojo: https://www.jsonschema2pojo.org/
    - copy response from Postman, paste into jsonschema2pojo
    - Package name: com.cydeo.dto.weather, Class name: WeatherDTO, select JSON
    - download zip, extract, copy "weather" folder and paste in "dto" package
    */


}
