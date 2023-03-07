package be.ephec.java.exercice.e07;

public class Programme {
    public static void main(String[] args) {
        Deck jeu=new Deck();
        for (Card c: jeu.getPaquet()) {
            System.out.println(c.toString());
        }
        jeu.shuffle();
        for (Card c: jeu.getPaquet()) {
            System.out.println(c.toString());
        }
    }
}
