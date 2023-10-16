package com.app.emploi.service;
import com.app.emploi.model.Emploi;
import com.app.emploi.model.Personne;
import com.app.emploi.repository.EmploiRepository;
import com.app.emploi.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.*;

@Service
public class EmploiServiceImpl implements EmploiService {

    @Autowired
    private EmploiRepository emploiRepository;

    @Autowired
    private PersonneRepository personneRepository;

    @Override
    public Optional<Personne> getPersonne(Long id) {
        Personne personne = new Personne();
        personne.setId(id);
        personne.setNom("Sangana");
        Optional<Personne> personne1 = Optional.of(personne);
        return personne1;
        //  personneRepository.findById(id);
    }

    @Override
    public List<Personne> getPersonnes() {

        return personneRepository.findAllByOrderByNomAsc();
    }

    @Override
    public String save(Personne personne) {

        if (personne != null) {
            int age1 = getAge(personne.getDateDeNaissance());

            int age = getAgePersonne(personne.getDateDeNaissance().getYear(),
                    personne.getDateDeNaissance().getMonthValue(),
                    personne.getDateDeNaissance().getDayOfMonth());
            if (age1 > 150) {

                return "Cette personne a plus de 150 ans";
            } else {
                personneRepository.save(personne);

                return "Personne enregistrée";
            }

        }
        return "veuiller renseigner les informations demandées";
    }
    @Override
    public String saveEmploi(Personne personne) {
        if (personne != null) {
            personne.getEmplois().forEach(emploi -> {
                emploiRepository.save(emploi);
            });
        }
        return null;
    }
  public   int	getAgePersonne(int year, int month, int date) {
      Calendar cal = new GregorianCalendar(year, month, date);
      Calendar now = new GregorianCalendar();
      int age = now.get(Calendar.YEAR) - cal.get(Calendar.YEAR);
      if ((cal.get(Calendar.MONTH) > now.get(Calendar.MONTH))
              || (cal.get(Calendar.MONTH) == now.get(Calendar.MONTH)
              && cal.get(Calendar.DAY_OF_MONTH) > now.get(Calendar.DAY_OF_MONTH))) {
          age--;
          return age;
      }
      return age;
  }
        @Override
    public List<Personne> filterByEntreprise(String name){
        List<Personne> personnes = getPersonnes();
        List<Personne> nouvelleListPersonnes = new ArrayList<>();

        personnes.forEach(personne -> {
            personne.getEntreprises().forEach(entreprise -> {
                if (entreprise.getNom().equals(name)) {
                    nouvelleListPersonnes.add(personne);
                }
            });

        });
        return nouvelleListPersonnes;

    }

    private int getAge( LocalDate dateDeNaissance){

        return (LocalDate.now().getYear() - dateDeNaissance.getYear());
    }

    @Override
    public List<Emploi> getEmploiPersonne(String name, LocalDate debut, LocalDate fin){
        Personne personne = personneRepository.findByNom(name);
        List<Emploi> emplois = new ArrayList<>();
        personne.getEmplois().forEach(emploi -> {
            if(emploi.getDateDeDebut().isAfter(debut) && emploi.getDateDeFin().isBefore(fin)){
                emplois.add(emploi);
            }
        });
        return emplois;
    }
}
