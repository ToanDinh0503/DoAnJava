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
@Table(name = "Parts")
public class Parts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer partID;

    @ManyToOne
    @JoinColumn(name = "testID")
    private Tests test;

    @Column(nullable = false)
    private Integer partNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PartType partType;

    @OneToMany(mappedBy = "part", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Questions> questions;

    public enum PartType {
        Image, Audio, MultipleChoice, TextAndImage
    }
}