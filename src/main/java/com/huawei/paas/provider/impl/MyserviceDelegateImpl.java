package com.huawei.paas.provider.impl;

import org.springframework.stereotype.Component;
import com.huawei.paas.provider.delegate.MyserviceDelegate;
import com.service.forecast.entity.objective2.ForecastSummary;
import com.service.forecast.entity.util.MultiResponse;

@Component
public class MyserviceDelegateImpl implements MyserviceDelegate {

    public String extra(String city){

        // Do some magic here
        return city;
    }

    public ForecastSummary show(String city){

        // Do some magic here
        ForecastSummary forecastSummary = new ForecastSummary();
        return forecastSummary.cityName(city);
    }

    public ForecastSummary test(String city){

        // Do some magic here
        ForecastSummary forecastSummary = new ForecastSummary();
        return forecastSummary.cityName(city);
    }
}