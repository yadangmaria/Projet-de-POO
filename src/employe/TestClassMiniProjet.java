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
public class TestClassMiniProjet {
  
    public static void main (String[] args){
        personel p=new personel();
        p.ajouterEmploye(new production("16B158di","yola","yva",2,"1999 janv",45.0));
        p.ajouterEmploye(new Vendeur("6B158di","boil","yna",8,"2002 janv",34.0));
        p.ajouterEmploye(new manutention("18B158fls","yla","yvette",4,"1009 janv",21));     
        p.ajouterEmploye(new representant("16B168fs","marie","yrenne",4,"1209 janv",68.0)); 
        p.ajouterEmploye(new sousmanutention("14A158fs","ramdom","yve",4,"1009 fev",20));
        p.ajouterEmploye(new sousproduction("12C158dla","youla","yvanna",4,"1029 janv",21.0));   
             
                
                
                p.affichersalaire();
                System.out.println("le salaire moyen est "+p.salairemoyen()+" franc cfa");
}
}
