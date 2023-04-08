package com.example.QA.repository;


import com.example.QA.dto.StreetDto;
import com.example.QA.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StreetRepo extends JpaRepository<Street, Long> {
    List<Street> findAllStreetsByCityId(Long cityId);
}
