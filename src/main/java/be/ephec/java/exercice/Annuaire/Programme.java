package be.ephec.java.exercice.Annuaire;

public class Programme {
    public static void main(String[] args) {
        Annuaire annuaire = new Annuaire();
        Fiche f1 = new Fiche("0497245","Lannister","Street");
        annuaire.ajouterFiche(f1,"Lannister");
        System.out.println(annuaire.getFiche("Lannister"));
    }
}
