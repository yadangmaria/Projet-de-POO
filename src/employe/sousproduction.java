/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employe;

/**
 *
 * @author Marie
 */
public class sousproduction extends production implements dangereux{
    public final static double prime=25000;
    public sousproduction(String matricule,String nom,String prenom,int age,String dateservice,double nbrproduit){
        super(matricule,nom,prenom,age,dateservice,nbrproduit);
        
    }
    public String getNom(){
  return getTitre()+prenom+ " "+nom;}
    public String getTitre(){
  
     return ("Le sousproducteur : ");}
    @Override
    public double calculersalaire(){
        return(5*nbrproduit+sbase+prime);
    }
    
}

    