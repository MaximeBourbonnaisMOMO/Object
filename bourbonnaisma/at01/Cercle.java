package bourbonnaisma.at01;

public class Cercle {
    private int h, k, rayon;

    public Cercle(int h, int k, int rayon) {
        this.h = h;
        this.k = k;
        setRayon(rayon);
    }

    public Cercle(int rayon) {
        this.h = 0;
        this.k = 0;
        this.rayon = rayon;
    }

    public int getRayon() {
        return rayon;
    }

    public final void setRayon(int rayon) {
        if (rayon >= 0) {
            this.rayon = rayon;
        } else {
            System.out.println("La valeur du rayon ne peut etre negative.");
        }
    }

    public void modifier(int h, int k) {
        this.h = h;
        this.k = k;
    }

    public double aire() {
        return Math.PI * Math.pow(this.rayon, 2);
    }

    public double perimetre() {
        return Math.PI * (this.rayon * 2);
    }

    public void afficher() {
        System.out.println("Coordonnees X du centre : " + this.h);
        System.out.println("Coordonnees Y du centre : " + this.k);
        System.out.println("Le rayon du cercle: " + this.rayon);
        System.out.println("Le perimetre du cercle: " + perimetre());
        System.out.println("L'aire du cercle: " + aire());
    }

    public boolean estSurCercle(int x, int y) {
        return Math.pow((x - this.h), 2) + Math.pow((y - this.k), 2) == Math.pow(this.rayon, 2);
    }
}
