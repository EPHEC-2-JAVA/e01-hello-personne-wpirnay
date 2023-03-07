package be.ephec.java.exercice.e09;

public class Dog extends Animal {
     protected String nom = "Chien";

    @Override
    public void makeNoise() {
        System.out.println("Je suis un "+nom+" et j'abboie");
    }
}
