
package employe;


public class representant extends Commerçant{
    public final static double r2=200;
    public final static double r1=0.2;
    public representant(String matricule,String nom,String prenom,int age,String dateservice,double chiffre_affaire){
        super(matricule,nom,prenom,age,dateservice,chiffre_affaire);
        this.chiffre_affaire =chiffre_affaire;
    }
    public String getTitre(){
  
     return ("Le representant: ");}
    public double calculersalaire(){
        return 0.2*getChiffre_affaire()+200;
    }

}
