package com.aleksa.feing.feing.restclient;

import com.aleksa.feing.feing.configuration.FeignConfig;
import com.aleksa.feing.feing.service.dto.House;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "wizardWorldClient",url = "https://wizard-world-api.herokuapp.com", configuration = FeignConfig.class)
public interface WizardWorldClient {

    @RequestMapping(method = RequestMethod.GET, value = "/HousAes")
    List<House> getAllHouses();

}
