import React from "react";
import classes from "./TitresH1.module.css";

const TitreH1 =(props) =>{
    const monCSS=`${classes.policeTitre} border border-dark p-2 m-2 bg-primary rounded text-center text-white font-size 15px`;
  return  <h1 className={monCSS}>{props.children}</h1>

}

export default TitreH1;

//const TitreH1 =(props) =>{
    
  //  return  <h1 className="border border-dark p-2 m-2 bg-primary rounded text-center text-white font-size 15px">{props.children}</h1>
  
  //}
  
  //export default TitreH1;