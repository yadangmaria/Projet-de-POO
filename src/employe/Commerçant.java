
package employe;

public abstract class Commerçant extends Employe {
    protected double chiffre_affaire;
        public Commerçant(String matricule,String nom,String prenom,int age,String dateservice,double chiffre_affaire){
            super(matricule,nom,prenom,age,dateservice);
            this.chiffre_affaire=chiffre_affaire;
        }
        public String getTitre(){
  
     return ("Le commerçant : ");}
        
    public double getChiffre_affaire(){
return chiffre_affaire;}
    
}
