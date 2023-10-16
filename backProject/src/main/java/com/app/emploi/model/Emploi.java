package com.app.emploi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="emplois")
public class Emploi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "entreprise_id")
    private Entreprise entreprise;

    private String posteOccupe;

    private LocalDate dateDeDebut;

    private LocalDate dateDeFin;

    @ManyToMany
    private List<Personne> personnes;
}
