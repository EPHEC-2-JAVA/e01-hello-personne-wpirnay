package be.ephec.java.exercice.Annuaire;

import java.util.HashMap;

public class Annuaire {

    protected HashMap<String,Fiche> fiche =new HashMap<>();
    public void ajouterFiche(Fiche f, String nom){
        fiche.put(nom,f);
    }
    public HashMap<String, Fiche> getFiche(String nom) {
        fiche.get(nom);
        return fiche;
    }

}
