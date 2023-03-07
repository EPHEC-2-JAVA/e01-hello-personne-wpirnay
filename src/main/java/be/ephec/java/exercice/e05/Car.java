package be.ephec.java.exercice.e05;

public class Car {
    private String marque;
    private String modele;
    private int numSerie;
    double prixVoit;
    public Car(String marque, String modele, int numSerie,double prixCatal){
        this.marque=marque;
        this.modele=modele;
        this.numSerie=numSerie;
        this.prixVoit=prixCatal;
    }
    public double getPrixCatal(){return prixVoit;}
    public String getMarque(){return marque;}
    public String getModele(){return modele;}
    public int getNumSerie(){return numSerie;}
    public void setPrix(double nvPrix){prixVoit=nvPrix;}
}
