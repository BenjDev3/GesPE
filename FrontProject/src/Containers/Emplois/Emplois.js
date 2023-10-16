import React, { Component } from 'react';
import Bouton from "../../Components/Boutons/Boutons";
import FormulaireAjout  from "../FormulairesAjout/FormulaireAjout";
import  DropzoneArea from "../DropzoneArea/DropzoneArea";

class Emplois extends Component{
  render(){
  return (
      <>
   <table className=" table text-center">
 <thead>
<tr className="table-dark">
       <th> Nom</th>
       <th> Prenom</th>
       <th> Age</th>
       <th colSpan="2">Actions</th>
 </tr>
</thead>
<tbody>
<tr>
   <td>Pratique du Reactjs</td> 
   <td>Paul Tabo</td>
   <td>200 </td>
  <td><Bouton typeBtnCSS="btn-warning">Modifier</Bouton></td> 
  <td><Bouton typeBtnCSS="btn-danger">Supprimer</Bouton></td>
   
</tr>
<tr>
   <td>Pratique du SQL </td> 
   <td>Benjamin D</td>
   <td>200 </td>
  <td><Bouton typeBtnCSS="btn-warning">Modifier</Bouton></td> 
  <td><Bouton typeBtnCSS="btn-danger">Supprimer</Bouton></td>
   
</tr>
<tr>
   <td>Pratique du Java </td> 
   <td>Alain D</td>
   <td>200 </td>
  <td><Bouton typeBtnCSS="btn-warning">Modifier</Bouton></td> 
  <td><Bouton typeBtnCSS="btn-danger">Supprimer</Bouton></td>
   
</tr>
</tbody>
   </table>
  {this.props.AjoutPersonne && <FormulaireAjoutPersonne/> }

 
  </>
  );

  }
}

export default Emplois;