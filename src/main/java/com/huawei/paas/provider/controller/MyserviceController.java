package com.huawei.paas.provider.controller;

import com.service.forecast.entity.objective2.ForecastSummary;
import com.service.forecast.entity.util.MultiResponse;
import com.huawei.paas.provider.delegate.MyserviceDelegate;

import javax.ws.rs.core.MediaType;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringBootProviderCodegen", date = "2019-04-30T15:23:21.501+08:00")

@RestSchema(schemaId = "myservice")
@RequestMapping(path = "/forecast" ,produces = { "application/json" }, consumes = { "application/json" })
public class MyserviceController {

    @Autowired
    private MyserviceDelegate userMyserviceDelegate;

    @RequestMapping(value = "/extra",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    @ApiResponses({
        @ApiResponse(code = 200, response = String.class, message = "response of 200"), 
        @ApiResponse(code = 400, response = MultiResponse.class, message = "parameter error"), 
        @ApiResponse(code = 401, response = MultiResponse.class, message = "parameter empty")
        })
    public String extra( @RequestParam(value = "city", required = true) String city){

        return userMyserviceDelegate.extra(city);
    }


    @RequestMapping(value = "/show",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    @ApiResponses({
        @ApiResponse(code = 200, response = ForecastSummary.class, message = "response of 200")
        })
    public ForecastSummary show( @RequestParam(value = "city", required = false) String city){

        return userMyserviceDelegate.show(city);
    }


    @RequestMapping(value = "/test",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    @ApiResponses({
        @ApiResponse(code = 200, response = ForecastSummary.class, message = "response of 200")
        })
    public ForecastSummary test( @RequestParam(value = "city", required = false) String city){

        return userMyserviceDelegate.test(city);
    }

}
