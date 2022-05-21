package com.aleksa.feing.feing.rest;

import com.aleksa.feing.feing.service.HouseService;
import com.aleksa.feing.feing.service.dto.House;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class HouseResource {

    private final HouseService houseService;

    @GetMapping("/houses")
    public List<House> getAllHouses() {
        return houseService.getAllHouses();
    }

}
