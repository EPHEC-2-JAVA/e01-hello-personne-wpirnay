package be.ephec.java.exercice.e02;

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nb;
        int base;


        //do {
            System.out.println("Quel est le nombre ?");
            nb = sc.nextLine();
            System.out.println("Quel est la base ?");
            base = sc.nextInt();

            //if (nb != "0" && base != 0) {
                System.out.println(Integer.parseInt(nb, base));
          //  }
        //} while (nb != "0" && base != 0);
    }
}
