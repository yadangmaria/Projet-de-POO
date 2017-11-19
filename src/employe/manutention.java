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
public class manutention extends Employe{
    protected int ht;
    public final static double r3=65;
    public manutention(String matricule,String nom,String prenom,int age,String dateservice,int heuretra){
        super(matricule,nom,prenom,age,dateservice);
        ht=heuretra;
    }
    public String getTitre(){
  
     return ("Le manutentionnaire : ");}
    @Override
    public double calculersalaire(){
        return (r3*ht+sbase);
    }
    
}
