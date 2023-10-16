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
       <br/>
    <Bouton typeBtnCSS="btn-primary" >Valider</Bouton>
    <h5 className="text-primary">Emplois</h5>
    <table className=" table text-center">
 <thead>
<tr className="table-dark">
       <th> Entreprise</th>
       <th> Poste occupé</th>
       <th> Date debut</th>
       <th> Date fin</th>
       <th colSpan="2">Actions</th>
 </tr>
</thead>
<tbody>
<tr>
   <td></td> 
   <td></td>
   <td></td>
   <td>200 </td>
  <td><Bouton typeBtnCSS="btn-warning">Modifier</Bouton></td> 
  <td><Bouton typeBtnCSS="btn-danger">Supprimer</Bouton></td>
   
</tr>
<tr>
   <td> </td> 
   <td></td>
   <td></td>
   <td>200 </td>
  <td><Bouton typeBtnCSS="btn-warning">Modifier</Bouton></td> 
  <td><Bouton typeBtnCSS="btn-danger">Supprimer</Bouton></td>
   
</tr>
<tr>
   <td> </td> 
   <td>A</td>
   <td></td>
   <td>200 </td>
  <td><Bouton typeBtnCSS="btn-warning">Modifier</Bouton></td> 
  <td><Bouton typeBtnCSS="btn-danger">Supprimer</Bouton></td>
   
</tr>
</tbody>
   </table>
     </div>
  <Bouton typeBtnCSS="btn-primary" >Valider</Bouton>

</form>
</>
  );
  
  }
}

export default FormulaireAjout;