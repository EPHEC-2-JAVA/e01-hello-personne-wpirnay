package be.ephec.java.exercice.e05;

import java.util.Random;

public class Programme {
    public static void main(String[] args) {
        Random rnd = new Random();
        Car prem = new Car("vw", "passat", 1234, 12500.00);
        Car sec = new Car("Toyota", "Corolla", 5698, 270000);
        Car trois = new Car("Peugeot", "kiroule", 666, 2000);
        Vendor Eugene = new Vendor("Grimm", "Eugene");
        Sale[] v = new Sale[10];

        for (int i = 0; i < 10; i++) {
            Sale vente;
            int j = rnd.nextInt(3);
            if (j == 0) {
                vente = new Sale(prem);
            } else if (j == 1) {
                vente = new Sale(sec);
            } else {
                vente = new Sale(trois);
            }
            v[i] = vente;
        }
        Eugene.setTabl(v);
        for (Sale s : Eugene.getVente()) {
            System.out.println(s.Afficher());
        }
    }
}

