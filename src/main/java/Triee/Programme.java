package Triee;

import java.util.*;

public class Programme {
    public static void main(String[] args) {
        System.out.println("Combien de chiffres?");
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        l=tri(n);
      // for (Integer i:l) {
            System.out.println(l);
       // }
        Set<Integer> s = new TreeSet<>();
        s=triSet(n);
        System.out.println(s);
    }
    public static ArrayList<Integer> tri(int n){
        Random rd = new Random();
        Integer j;
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            j=rd.nextInt(1001);
            l.add(j);
        }
        Collections.sort(l);
        return l;
    }
    public static Set<Integer> triSet (int n){
        Set<Integer> reponse = new TreeSet<>();
        Random rd = new Random();
        Integer j;
        for(int i=0;i<n;i++){
            j= rd.nextInt(1001);
            reponse.add(j);
        }
        return reponse;
    }
}
