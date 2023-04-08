package com.example.QA.repository;

import com.example.QA.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.List;

@Repository
public interface ShopRepo extends JpaRepository<Shop, Long> {
    @Query(value = "select * from shop where city_id = ? or street_id = ? or opening = ?", nativeQuery = true)
    List<Shop> findShop(Long cityId, Long streetId, LocalTime opening,LocalTime closing);
}
