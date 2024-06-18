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
@Table(name = "Answers")
@Data
public class Answers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer answerID;

    @Column(nullable = false)
    private Integer userID;

    @ManyToOne
    @JoinColumn(name = "questionID")
    private Questions question;

    @ManyToOne
    @JoinColumn(name = "chosenChoiceID")
    private Choices chosenChoice;
}