package com.app.emploi.repository;

import com.app.emploi.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Long> {


    List<Personne> findAllByOrderByNomAsc();

    Personne findByNom(String name);
}
