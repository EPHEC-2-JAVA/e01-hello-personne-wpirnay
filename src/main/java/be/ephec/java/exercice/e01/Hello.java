package be.ephec.java.exercice.e01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Person bibi = new Person();
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);

        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est votre nom?");
        bibi.lastName = sc.nextLine();

        System.out.println("Quel est votre prénom ? ");
        bibi.firstName = sc.nextLine();

        System.out.println("Quelle est votre année de naissance ? ");
        bibi.yearOfBirth = sc.nextInt();

        bibi.computeAge(year);
        bibi.display();

    }
}
