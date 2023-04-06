package com.neptunesoftware.integrator.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class RubikonCredentials {

    @Value("${rubikon.channelId}")
    private String channelId;
    @Value("${rubikon.currBUId}")
    private String currBUId;
    @Value("${rubikon.transmissionTime}")
    private String transmissionTime;
    @Value("${rubikon.userAccessCode}")
    private String userAccessCode;
    @Value("${rubikon.userLoginId}")
    private String userLoginId;
    @Value("${rubikon.userPassword}")
    private String userPassword;
    @Value("${rubikon.userRoleId}")
    private String userRoleId;
    @Value("${rubikon.validXapiRequest}")
    private String validXapiRequest;
    @Value("${rubikon.transactionCurrencyCode}")
    private String transactionCurrencyCode;
    @Value("${rubikon.channelCode}")
    private String channelCode;
}
