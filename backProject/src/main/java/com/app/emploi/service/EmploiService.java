package com.app.emploi.service;

import com.app.emploi.model.Emploi;
import com.app.emploi.model.Personne;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface EmploiService {


    Optional<Personne> getPersonne(Long id);
    List<Personne> getPersonnes();

    String save(Personne personne);

    List<Personne> filterByEntreprise(String name);
    String saveEmploi(Personne personne);

    List<Emploi> getEmploiPersonne(String name, LocalDate debut, LocalDate fin);

}
