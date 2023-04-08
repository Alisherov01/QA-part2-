package com.example.QA.controller;

import com.example.QA.dto.StreetDto;
import com.example.QA.service.StreetService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class StreetController {
    StreetService streetService;

    @GetMapping("/allStreets/{cityId}")
    List<StreetDto> getAllStreetByCityId(@PathVariable Long cityId){
        return streetService.getAllStreetsByCity(cityId);
    }
}
