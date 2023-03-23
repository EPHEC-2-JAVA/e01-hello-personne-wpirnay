package be.ephec.java.exercice.Annuaire;

public class Fiche {
    protected String numTel;
    protected String nom;
    protected String prenom;
    protected String adresse;
    public Fiche(String numTel, String nom, String prenom, String adresse) {
        this.numTel = numTel;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }
    @Override
    public String toString() {
        return  prenom +" "+ nom+" "+numTel+" "+adresse;
    }
}
