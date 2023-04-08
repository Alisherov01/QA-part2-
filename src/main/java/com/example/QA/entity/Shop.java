package com.example.QA.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String shopName;

    @ManyToOne
    private City city;

    @ManyToOne
    private Street street;

    @Column(length = 200)
    private String house;

    @DateTimeFormat(pattern = "HH:mm:ss")
    private LocalTime opening;

    @DateTimeFormat(pattern = "HH:mm:ss")
    private LocalTime closing;
}
