package com.example.QA.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopDto {
    private Long id;
    private String shopName;
    private String house;
    private LocalTime opening;
    private LocalTime closing;
}
