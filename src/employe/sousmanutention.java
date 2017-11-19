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
public class sousmanutention extends manutention implements dangereux {
    public final static double prime=25000;
    public sousmanutention(String matricule,String nom,String prenom,int age,String dateservice,int ht){
        super(matricule,nom,prenom,age,dateservice,ht);
        
    }
    public String getTitre(){
  
     return ("Le sousmanutentionnaire : ");}
    @Override
    public double calculersalaire(){
        return (ht*65+prime);
    }
             
    
}
