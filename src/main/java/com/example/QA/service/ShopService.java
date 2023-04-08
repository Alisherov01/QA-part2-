package com.example.QA.service;

import com.example.QA.dto.ShopDto;
import com.example.QA.entity.Shop;
import com.example.QA.repository.ShopRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ShopService {
    ShopRepo shopRepo;

    private ShopDto mapToDto(Shop shop){
        return new ShopDto(shop.getId(),
                            shop.getShopName(),
                            shop.getHouse(),
                            shop.getOpening(),
                            shop.getClosing());
    }
    public Long create(Shop shop){
        mapToDto(shop);
        return shopRepo.save(shop).getId();
    }

    public List<ShopDto> findShop(Long cityId, Long streetId, LocalTime opening, LocalTime closing){
        List<Shop> shops = shopRepo.findShop(cityId,streetId,opening,closing);
        List<ShopDto> shopDtos = new ArrayList<>();
        for (Shop shop : shops){
            ShopDto dto = mapToDto(shop);
            shopDtos.add(dto);
        }
        return shopDtos;
    }
}
