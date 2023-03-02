package be.ephec.java.exercice.e07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private enum choixCouleur{pique, coeur, carreau, trèfle}
    private String col;
    private List<Card> paquet = new ArrayList<>();
    public Deck() {
        for (int j = 0; j <= choixCouleur.trèfle.ordinal(); j++) {
            choixCouleur[] c = choixCouleur.values();
            col = c[j].toString();
            for (int i = 1; i <= 13; i++) {
                Card jeu = new Card(col, i);
                paquet.add(jeu);
            }
        }
    }
    public List<Card> getPaquet() {
        return paquet;
    }
   // public Card getCarteDuPaquet(int i){}
    public void shuffle() {
        Card temp1=null;
        Card temp2=null;
        for (int i = 0; i < paquet.size(); i++) {
            Random r = new Random();
            int j=r.nextInt(52);
            temp1=paquet.get(i);
            temp2=paquet.get(j);
            paquet.set(i,temp2);
            paquet.set(j,temp1);
        }
    }
}
