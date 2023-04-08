package com.example.QA.service;

import com.example.QA.dto.StreetDto;
import com.example.QA.entity.Street;
import com.example.QA.repository.StreetRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StreetService {
    StreetRepo streetRepo;

    private StreetDto mapToDto(Street street){
        return new StreetDto(street.getId(),
                            street.getStreetName());
    }

    public List<StreetDto> getAllStreetsByCity(Long cityId){
        List<Street> streets = streetRepo.findAllStreetsByCityId(cityId);
        List<StreetDto> streetDtos = new ArrayList<>();

        for (Street street : streets){
            StreetDto dto = mapToDto(street);
            streetDtos.add(dto);
        }
        return streetDtos;
    }


}
