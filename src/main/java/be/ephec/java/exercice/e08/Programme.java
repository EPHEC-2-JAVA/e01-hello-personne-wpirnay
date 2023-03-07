package be.ephec.java.exercice.e08;

import java.util.Random;

public class Programme {
    public static void main(String[] args) {
        Shape[] tabl = new Shape[10];
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            int j = r.nextInt(3);
            if (j == 0) {
                tabl[i] = new Circle(2, 4);
            }
            else if (j == 1) {
                tabl[i] = new Square(2, 4);
            }
            else{
                tabl[i] = new Triangle(2, 4);
            }
        }
        for (Shape s:tabl) {
            s.affiche();
            s.efface();
        }
    }
}
