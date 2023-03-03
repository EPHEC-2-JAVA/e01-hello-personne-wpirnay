package Salaires;

public class Technicien extends Employe {
    String prenom;
    String nom;
    int age;
    String annee;
    int nbrUnite;
    public Technicien(String prenom, String nom, int age, String annee, int nbrUnite) {
    }

    @Override
    public double calculerSalaire() {
        return 0;
    }

    @Override
    public String getNom() {
        return null;
    }
}
