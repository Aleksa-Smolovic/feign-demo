package com.aleksa.feing.feing.configuration;

import com.aleksa.feing.feing.restclient.WizardWorldClientErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public WizardWorldClientErrorDecoder wizardWorldClientErrorDecoder(){
        return new WizardWorldClientErrorDecoder();
    }

}
