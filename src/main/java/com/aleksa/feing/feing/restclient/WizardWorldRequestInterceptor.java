package com.aleksa.feing.feing.restclient;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WizardWorldRequestInterceptor {

    static String DYNAMIC_VALUE = "INITIAL_VALUE";
    private static final String DYNAMIC_HEADER = "DYNAMIC_HEADER";

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            if (requestTemplate.headers().containsKey(DYNAMIC_HEADER))
                requestTemplate.removeHeader(DYNAMIC_HEADER);
            requestTemplate.header(DYNAMIC_HEADER, DYNAMIC_VALUE);
        };
    }

}
