package com.huawei.paas.provider.delegate;

import com.service.forecast.entity.objective2.ForecastSummary;
import com.service.forecast.entity.util.MultiResponse;

public interface MyserviceDelegate {

    String extra(String city);

    ForecastSummary show(String city);

    ForecastSummary test(String city);
}
