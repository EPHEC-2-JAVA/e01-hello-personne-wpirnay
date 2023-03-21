package be.ephec.java.exercice.Annuaire;

public class Fiche {
    protected String numTel;
    protected String nom;
    protected String adresse;
    public Fiche(String numTel, String nom, String adresse) {
        this.numTel = numTel;
        this.nom = nom;
        this.adresse = adresse;
    }
    @Override
    public String toString() {
        return  nom+" "+numTel+" "+adresse;
    }
}
