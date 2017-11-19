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
public class production extends Employe{
    protected double nbrproduit;
    public production(String matricule,String nom,String prenom,int age,String dateservice,double nbrproduit){
        super(matricule,nom,prenom,age,dateservice);
        this.nbrproduit=nbrproduit;
    }
    @Override
    public double calculersalaire() {
        return (5*nbrproduit+sbase);
    }
    @Override
    public String getNom(){
     return ("Le producteur:") + prenom + nom;
    }
}
