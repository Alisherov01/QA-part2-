package com.example.QA.service;

import com.example.QA.dto.CityDto;
import com.example.QA.entity.City;
import com.example.QA.entity.Street;
import com.example.QA.repository.CityRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CityService {
    CityRepo cityRepo;

    private CityDto mapToDto(City city) {
        return new CityDto(city.getCityName());
    }

    public List<CityDto> getAllCity() {
        List<City> cities = cityRepo.findAll();
        List<CityDto> cityDtos = new ArrayList<>();
        for (City city : cities) {
            CityDto dto = mapToDto(city);
            cityDtos.add(dto);
        }
        return cityDtos;
    }

}

