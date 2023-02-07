package e09;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rdn = new Random();
        Animal[] animaux = new Animal[10];
        for(int i=0;i<animaux.length;i++){
            if(rdn.nextInt(2)==0){
                animaux[i] = new Cat();

            }
            else{
                animaux[i] = new Dog();
            }
        }
        for (Animal a:animaux) {
            a.makeNoise();

        }
    }
}
