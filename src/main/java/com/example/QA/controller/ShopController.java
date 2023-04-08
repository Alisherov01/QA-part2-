package com.example.QA.controller;

import com.example.QA.dto.ShopDto;
import com.example.QA.entity.Shop;
import com.example.QA.service.ShopService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.List;

@RestController
@AllArgsConstructor
public class ShopController {
    ShopService shopService;

    @PostMapping("/shop/create")
    Long create(@RequestBody Shop shop) {
        return shopService.create(shop);
    }

    @GetMapping("/shop/find")
    public List<ShopDto> getShopByFilter(@RequestParam(required = false) Long cityId,
                                         @RequestParam(required = false) Long streetId,
                                         @RequestParam(required = false) LocalTime opening,
                                         @RequestParam(required = false) LocalTime closing) {
        return shopService.findShop(cityId, streetId, opening, closing);
    }
}

