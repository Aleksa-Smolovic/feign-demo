package com.aleksa.feing.feing.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class House {

    private String id;
    private String name;
    private String founder;
    private String animal;
    private List<HouseHead> heads;

}
