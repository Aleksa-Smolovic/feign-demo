package com.aleksa.feing.feing.restclient;

import feign.RetryableException;
import feign.Retryer;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Slf4j
public class WizardWorldClientRetryer implements Retryer {

    private int attempt = 0;

    @Override
    public void continueOrPropagate(RetryableException e) {
        log.info("Feign retry attempt {} due to {} ", attempt, e.getMessage());

        WizardWorldRequestInterceptor.DYNAMIC_VALUE = "NEW_DYNAMIC_VALUE";
        if (attempt++ == 2)
            throw e;
    }

    @Override
    public Retryer clone() {
        return new WizardWorldClientRetryer();
    }
}
