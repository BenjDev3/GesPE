package com.app.emploi.repository;

import com.app.emploi.model.Emploi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmploiRepository extends JpaRepository<Emploi, Long> {



}
