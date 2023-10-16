import React, { Component } from 'react';
import Bouton from "../../Components/Boutons/Boutons";
class FormulaireAjout extends Component{
 
  render(){
  return (
      <>
<h5 className="text-primary">Personnes</h5>
    <form>
    <div className="mb-3">
    <label for="titre" className="form-label">Nom</label>
    <input type="text" className="form-control" id="titre" />
    <label for="auteur" className="form-label">Prénom</label>
    <input type="text" className="form-control" id="auteur" />
    <label for="nbpages" className="form-label">Age</label>
    <input type="number" className="form-control" id="nbpages" />
   {/* <label for="ajouFichiers" className="form-label">Ajouter une pièce-jointe :  </label> */}
       <br/>
     </div>
  <Bouton typeBtnCSS="btn-primary" >Valider</Bouton>

</form>
</>
  );
  
  }
}

export default FormulaireAjout;