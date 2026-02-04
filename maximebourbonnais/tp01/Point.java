/**
* Represente un point sur le plan cartesien.
*
* @author bourbonnais, maxime
*
*/

public class Point {
    private int x, y;
    private char nom;

    public Point(int x, int y, char nom) {
        this.x = x;
        this.y = y;
        this.nom = nom;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
        this.nom = 'O';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getNom() {
        return nom;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public String coordonnees() {
        return String.format("%s(%s, %s)", this.nom, this.x, this.y);
    }

    private String numeroQuadrant() {
        boolean pos1 = false;
        boolean pos2 = false;
        String s = "";

        if (this.x > 0) {
            pos1 = true;
        }

        if (this.y > 0) {
            pos2 = true;
        }

        if (pos1 == true && pos2 == true) {
            s = "1ier quadrant";
        }
        else if (pos1 == false && pos2 == true) {
            s = "2ieme quadrant";
        }
        else if (pos1 == false && pos2 == false) {
            s = "3ieme quadrant";
        }
        else if (pos1 == true && pos2 == false) {
            s = "4ieme quadrant";
        }

        if (this.x == 0 && this.y == 0) {
            s = "sur axe(s)";
        }

        return s;
    }

    public void afficher() {
        System.out.println("Point " + coordonnees() + "\nPosition dans le plan catersien: " + numeroQuadrant() + "\n");
    }

    public double distance(Point autrePoint) {
        return Math.sqrt(Math.pow((autrePoint.getX() - this.x), 2) + (Math.pow(autrePoint.getY() - this.y, 2)));
    }

    public static void main(String[] args) {
        Point p = new Point(6, 3, 'M');
        Point p1 = new Point(12, 6, 'B');
        p.afficher();
        System.out.println(p.distance(p1));
    }
}
