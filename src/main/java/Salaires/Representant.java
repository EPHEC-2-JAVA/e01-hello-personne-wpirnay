package Salaires;

public class Representant extends Employe{
    String nom;
    String prenom;
    int age;
    String dateEntree;
    int chfrAffaire;

    public Representant(String nom, String prenom, int age, String dateEntree, int chfrAffaire){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
        this.dateEntree=dateEntree;
        this.chfrAffaire=chfrAffaire;
    }

    @Override
    public double calculerSalaire() {
        double Salaire=(chfrAffaire*0.20)+800.00;

        return Salaire;
    }

    @Override
    public String getNom() {
        return nom+" "+prenom;    }
}
