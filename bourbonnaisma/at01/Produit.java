/**
* Cette classe contient les attributs et methodes de la classe Produit.
*
* @author Bourbonnais Maxime
*
*/

package bourbonnaisma.at01;

public class Produit {
    private String description;
    private double prix;

    public Produit(String description, double prix) {
        this.description = description;
        this.prix = prix;
    }

    // Getter/Setter
    public String getDescription() {
        return description;
    }

    public double getPrix() {
        return prix;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    // Methodes
    public double prixApresRabais(double pourcentageRabais) {
        return prix - (pourcentageRabais/100) * prix;
    }

    public void afficher() {
        System.out.println("Description : " + description);
        System.out.println("Prix:           " + String.format("%.2f$", prix));
    }
}