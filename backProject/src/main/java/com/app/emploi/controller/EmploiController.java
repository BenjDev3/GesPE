package com.app.emploi.controller;

import com.app.emploi.model.Emploi;
import com.app.emploi.model.Personne;
import com.app.emploi.service.EmploiService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public
class EmploiController {

    private final EmploiService emploiService;


    @GetMapping("/personnes/{id}")
    public ResponseEntity<Optional<Personne>> getPersonne(@PathVariable Long id){


        return ResponseEntity.ok(emploiService.getPersonne(id));
    }

    @GetMapping("/personnes")
    public ResponseEntity<List<Personne>> getPersonnes(){

        return ResponseEntity.ok(emploiService.getPersonnes());
    }

    @PostMapping("/savePersonne")
    public ResponseEntity<String> savePersonne(Personne personne){

        return ResponseEntity.ok(emploiService.save(personne));
    }

    @GetMapping("/filterByEntreprise/{name}")
    public ResponseEntity<List<Personne>> filterByEntreprise(@PathVariable String name){

        return ResponseEntity.ok(emploiService.filterByEntreprise(name));

    }

    @GetMapping("/emplois")
    public ResponseEntity<List<Emploi>> getEmploiPersonneParPlage(String name,
                                                                  LocalDate debut, LocalDate fin){

        return ResponseEntity.ok(emploiService.getEmploiPersonne(name, debut, fin));

    }

}
