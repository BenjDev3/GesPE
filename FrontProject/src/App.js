
import React, { Component } from 'react';
import TitreH1 from "./Components/Titres/TitresH1";
import Bouton  from "./Components/Boutons/Boutons";
import Persone  from "./Containers/Personne/Emploi";
import axios from 'axios';

const api= axios.create({
  baseURL:'http://localhost:8082/api/personnes/'
})

class App extends Component{

constructor(){
  super();

  api.get('http://localhost:3000/', //proxy uri
  {
     headers: {
        authorization: ' xxxxxxxxxx' ,
        'Content-Type': 'application/json'
     } 
  })
  api.get(res=>{
    console.log("xxxxxxxxxxxxxxxxx",res.data)
    console.log(console.error())
  });

}
  state = {

    AjoutPersonne: false
  }
  handleClicAjouPersonne= ()=> {
   
    this.setState((oldState,props)=>{

     return{AjoutPersonne: !oldState.AjoutPersonne }

    })
  }
  render(){

  return (
    
    <div className="container">
    <TitreH1><h1>Liste des personnes</h1></TitreH1>
    <Persone AjoutPersonne={this.state.AjoutPersonne} />
    
    <Bouton typeBtnCSS="btn-success" css="w-100" clic={this.handleClicAjouPersonne}>

    { !this.state.AjoutPersonne ?"Ajouter":"Fermer l'ajout"}</Bouton>
   
    </div>
  );
  }
}



export default App;  
