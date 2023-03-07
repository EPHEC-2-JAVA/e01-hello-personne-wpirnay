package be.ephec.java.exercice.e03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        System.out.println("Quel est le nombre de lignes ? ");
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        int[][] tri = Pascal.triangle(nb);
        for (int[] tb : tri) {
            for (int val : tb) {
                System.out.print(val+"\t");
            }
            System.out.println();
        }
    }
}
