package be.ephec.java.exercice.e08;

public class Square extends Shape{
    public Square(int x, int y) {
        super(x, y);
    }
    @Override
    public void affiche() {
        System.out.println("je suis un carré et je m'affiche");
    }
    @Override
    public void efface() {
        System.out.println("Je suis un carré et je m'éfface");
    }
}
