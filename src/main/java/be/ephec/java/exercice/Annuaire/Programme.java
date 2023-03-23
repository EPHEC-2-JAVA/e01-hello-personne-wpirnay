package be.ephec.java.exercice.Annuaire;

public class Programme {
    public static void main(String[] args) {
        Annuaire annuaire = new Annuaire();
        Fiche f1 = new Fiche("0497245","Lannister","Jaime","Lannis Port");
        Fiche f2 = new Fiche("04558852", "Stark", "Eddard", "Winterfell");
        Fiche f3 = new Fiche("04558852", "Truc", "Brandon", "Winterfell");
        annuaire.ajouterFiche(f1,"Lannister");
        annuaire.ajouterFiche(f2,"Stark");
        annuaire.ajouterFiche(f3,"Truc");
        System.out.println(annuaire.getFiche("Lannister"));
        System.out.println(annuaire.getFiche("Stark"));
        System.out.println(annuaire.getFiche("Truc"));
    }
}
