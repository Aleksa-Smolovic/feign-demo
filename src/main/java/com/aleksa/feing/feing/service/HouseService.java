package com.aleksa.feing.feing.service;

import com.aleksa.feing.feing.restclient.WizardWorldClient;
import com.aleksa.feing.feing.service.dto.House;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HouseService {

    private final WizardWorldClient wizardWorldClient;

    public List<House> getAllHouses() {
        return wizardWorldClient.getAllHouses();
    }

}
