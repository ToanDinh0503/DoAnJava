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
@Table(name = "Choices")
@Data
public class Choices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer choiceID;

    @ManyToOne
    @JoinColumn(name = "questionID")
    private Questions question;

    @Column(nullable = false)
    private String choiceText;

    @Column(nullable = false)
    private Boolean isCorrect;
}