package com.aleksa.feing.feing.restclient;

import feign.Response;
import feign.RetryableException;
import feign.codec.ErrorDecoder;

import java.time.Instant;
import java.util.Date;

public class WizardWorldClientErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder defaultErrorDecoder = new Default();

    @Override
    public Exception decode(String s, Response response) {
        Exception exception = defaultErrorDecoder.decode(s, response);
        switch (response.status()) {
            case 404:
                return new RetryableException(response.status(), exception.getMessage(), response.request().httpMethod(), Date.from(Instant.now()), response.request());
            default: return exception;

        }
    }
}
