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
public class personel {
    private Employe[]collectionemploye;
    //nombre des employèsde l'entreprise
    private int nbreEmploye;
    //nombre maximal d'employès que peut contenir l'entreprise
    private final static int nbremaxEmploye=200;
    
    public personel(){
        //mon tableau est appelè collectionEmploye.
        collectionemploye=new Employe[nbremaxEmploye];
        nbreEmploye=0;
        
    }
    
    public void ajouterEmploye(Employe y){
        ++nbreEmploye;
        if(nbreEmploye<=nbremaxEmploye)
        {
            collectionemploye[nbreEmploye-1]=y;
        }
        else
            System.out.println("pas plus de"+nbremaxEmploye+"employe ");
        
        }
    public double salairemoyen(){
        double som=0.0;
        for(int i=0;i<nbreEmploye;i++){
            som+=collectionemploye[i].calculersalaire();
        }
        return som/nbreEmploye;
    }
    public void affichersalaire(){
        for(int i=0;i<nbreEmploye;i++){
            System.out.println(collectionemploye[i].getNom()+" "+"gagne"+" "+collectionemploye[i].calculersalaire()+"francs ");
        }
    }
    
    
}
