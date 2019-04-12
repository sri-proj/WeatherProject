package com.cts.SpringBootCtsWeather;

import com.cts.model.WeatherReportResponse;
import com.cts.model.getweather.GetWeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    @GetMapping("/weather/{id}")
    private GetWeatherResponse getWeatherReport(@PathVariable("id") int id){
        return weatherService.getWeatherReport(id);
    }
}