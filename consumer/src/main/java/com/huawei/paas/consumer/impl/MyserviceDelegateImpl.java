package com.huawei.paas.consumer.impl;

import org.springframework.stereotype.Component;
import org.apache.servicecomb.provider.pojo.RpcReference;
import com.huawei.paas.consumer.delegate.MyserviceDelegate;
import com.service.forecast.entity.objective2.ForecastSummary;
import com.service.forecast.entity.util.MultiResponse;

@Component
public class MyserviceDelegateImpl implements MyserviceDelegate {

    @RpcReference(microserviceName = "myprovider", schemaId = "myservice")
    private MyserviceDelegate useMyserviceDelegate;

    public String extra(String city){

        // Return MyserviceDelegate.extra()
        return useMyserviceDelegate.extra(city);
    }

    public ForecastSummary show(String city){

        // Return MyserviceDelegate.show()
        return useMyserviceDelegate.show(city);
    }

    public ForecastSummary test(String city){

        // Return MyserviceDelegate.show()
        return useMyserviceDelegate.show(city);
    }
}