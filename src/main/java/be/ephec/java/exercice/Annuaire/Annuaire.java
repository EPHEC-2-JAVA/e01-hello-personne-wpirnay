package be.ephec.java.exercice.Annuaire;

import java.util.HashMap;

public class Annuaire {

    protected HashMap<String,Fiche> fiches =new HashMap<>();
    public void ajouterFiche(Fiche f, String nom){
        fiches.put(nom,f);

    }
    public Fiche getFiche(String nom) {
        return fiches.get(nom);

    }
    public String toString()
    {
        return fiches.toString();
    }

}
