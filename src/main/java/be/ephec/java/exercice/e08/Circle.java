package be.ephec.java.exercice.e08;

public class Circle extends Shape{
    public Circle(int x, int y) {
        super(x, y);
    }

    @Override
    public void affiche() {
        System.out.println("Je suis un cercle et je m'affiche");
    }

    @Override
    public void efface() {
        System.out.println("Je suis un cercle et je m'éfface");
    }
}