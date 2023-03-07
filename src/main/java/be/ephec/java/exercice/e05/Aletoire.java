package be.ephec.java.exercice.e05;

import java.util.Random;

public class Aletoire {
    int v;
    static Random r = new Random();
    public int nbAle(){
        v=r.nextInt(2);
        return v;
    }
}
