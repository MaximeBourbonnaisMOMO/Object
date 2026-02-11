/**
* Cette classe contient la méthode principale main() pour tester la classe Produit.
*
* @author Bourbonnais Maxime
*
*/

package bourbonnaisma.at01;

public class MainProduit {

    public static void main(String[] args) {
    
    //Question a
    Produit prod1 = new Produit("Hilroy Feuilles mobiles lignées 200 Feuilles", 2.47);
    
    //Question b
    Produit prod2 = new Produit("Hilroy Cahiers d’exercices Canada 32 pages", 1.86);
    
    //Question c
    System.out.println("Acces a la description de prod1: " + prod1.getDescription());
        
    //Question d
    System.out.println("Acces au prix de prod1: " + prod1.getPrix());
    
    //Question e
    prod1.setPrix(3.25);
    
    //Question f
    prod1.setDescription("Hilroy Feuilles mobiles carreaux 250 Feuilles");
    
    //Question g
    prod1.afficher();
    
    //Question h	
    System.out.println("Prix apres rabais de 20.0% de prod1: " + prod1.prixApresRabais(20));
    
    //Question i
    System.out.println("Le total des prix de prod1 et de prod2: " + (prod1.getPrix() + prod2.getPrix()));

    }
}