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
public class Vendeur extends Commerçant{
    public Vendeur(String matricule,String nom,String prenom,int age,String dateservice,double chiffre_affaire){
    super(matricule, nom, prenom, age, dateservice,chiffre_affaire);
    }
    public String getTitre(){
  
     return ("Le vendeur : ");}
    
    public double calculersalaire(){
        
        return 0.2*getChiffre_affaire()+100;
    }
    
}
