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

    public String[] getRegionCountry() {
        String url = baseUrl + "/getRegionCountry";
        return restTemplate.getForObject(url, String[].class);
    }

    public String getRegionDataset() {
        String url = baseUrl + "/getRegionDataset";
        return restTemplate.getForObject(url, String.class); // Assuming the response is in String format
    }

    public String[] getRegionProvince() {
        String url = baseUrl + "/getRegionProvince";
        return restTemplate.getForObject(url, String[].class);
    }

    public String getSupportCityDataset(String regionCode) {
        String url = baseUrl + "/getSupportCityDataset?theRegionCode=" + regionCode;
        return restTemplate.getForObject(url, String.class); // Assuming the response is in String format
    }

    public String[] getSupportCityString(String regionCode) {
        String url = baseUrl + "/getSupportCityString?theRegionCode=" + regionCode;
        return restTemplate.getForObject(url, String[].class);
    }

    public String[] getWeather(String cityCode) {
        String url = baseUrl + "/getWeather?theCityCode=" + cityCode + "&theUserID=";
        return restTemplate.getForObject(url, String[].class);
    }
}


