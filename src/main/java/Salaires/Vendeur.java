package Salaires;

public class Vendeur extends Employe {
    String prenom;
    String nom;
    int age;
    String dateEntree;
    int chfrAffaire;
    public Vendeur(String prenom, String nom, int age, String dateEntree , int chfrAffaire) {
        this.prenom=prenom;
        this.nom=nom;
        this.age=age;
        this.dateEntree=dateEntree;
        this.chfrAffaire=chfrAffaire;
    }

    @Override
    public double calculerSalaire() {
        double Salaire=(chfrAffaire*0.20)+400.00;

        return Salaire;
    }
    @Override
    public String getNom() {
        return nom+" "+prenom;
    }
}
