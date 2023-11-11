package com.example.skycastdemo.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private final RestTemplate restTemplate;
    private final String baseUrl = "http://ws.webxml.com.cn/WebServices/WeatherWS.asmx";

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String[] getWeather(String cityCode) {
        String url = baseUrl + "/getWeather?theCityCode=" + cityCode + "&theUserID=";
        return restTemplate.getForObject(url, String[].class);
    }
}


