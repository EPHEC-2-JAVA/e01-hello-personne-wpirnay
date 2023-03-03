package Salaires;

public abstract class Employe {
    protected String nom;
    protected String prenom;
    protected int age;
    protected int dateEntree;
    //protected enum fonction{Vente, Représentation, Prodution, Manutention};


    public abstract double calculerSalaire();

    public abstract String getNom();

}
