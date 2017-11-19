
package employe;

public abstract class Employe {
    
    //attribut
    private String matricule;
    protected String nom;
    protected String prenom;
    private int age;
    private String dateservice;
    public double sbase;
    
 //les methodes
 public abstract double calculersalaire();
 public String getTitre(){
  
     return ("L'employé : ");}
  public String getNom(){
  return getTitre()+" "+prenom+ " "+nom;}
 //constructeur
     public Employe(String matricule,String nom,String prenom,int age,String dateservice){
         this.matricule=matricule;
         this.nom=nom;
         this.prenom=prenom;
         this.age=age;
         this.dateservice=dateservice;
     } 
}
     
      
     
