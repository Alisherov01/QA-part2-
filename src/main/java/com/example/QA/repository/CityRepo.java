package com.example.QA.repository;

import com.example.QA.entity.City;
import com.example.QA.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepo extends JpaRepository<City, Long> {

}
