# GesPE
# Application de Gestion de Personnes et d'Emplois

Cette application permet de gérer des informations sur les personnes, y compris leur âge, et de gérer des emplois associés à ces personnes.

## Fonctionnalités

### Enregistrement de Nouvelles Personnes

L'application vous permet d'enregistrer de nouvelles personnes. Cependant, seules les personnes de moins de 150 ans peuvent être enregistrées. Si une personne a plus de 150 ans, l'application renverra une erreur.

### Ajout d'Emploi à une Personne

Vous pouvez ajouter un emploi à une personne avec une date de début et de fin d'emploi. Pour le poste actuellement occupé, la date de fin n'est pas obligatoire. Une personne peut avoir plusieurs emplois aux dates qui se chevauchent.

### Liste de Toutes les Personnes

L'application peut renvoyer la liste de toutes les personnes enregistrées par ordre alphabétique. En plus du nom, chaque personne est accompagnée de son âge et de son(s) emploi(s) actuel(s).

### Recherche des Personnes par Entreprise

Vous pouvez rechercher toutes les personnes ayant travaillé pour une entreprise donnée.

### Recherche des Emplois d'une Personne entre Deux Plages de Dates

L'application permet également de rechercher tous les emplois d'une personne entre deux plages de dates.

## Technologies Utilisées

- **Backend** : Cette application utilise Spring Boot pour créer une API REST en Java.
- **Frontend** : Le frontend de l'application est développé en React.js.
