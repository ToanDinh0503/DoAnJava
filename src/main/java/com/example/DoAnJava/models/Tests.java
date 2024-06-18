package com.example.DoAnJava.models;

import jakarta.persistence.Entity;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Tests")
public class Tests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer testID;

    @Column(nullable = false)
    private String testName;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @OneToMany(mappedBy = "test", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Parts> parts;

    @PrePersist
    protected void onCreate() {
        createdDate = LocalDateTime.now();
    }
}