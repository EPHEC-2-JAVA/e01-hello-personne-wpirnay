package be.ephec.java.exercice.e05;

public class Vendor extends Person {
    Sale[] vente = new Sale[10];
    public Vendor(String lastName, String firstName) {
        super(lastName, firstName);
    }
    public void setTabl(Sale[] v)
    {vente = v;}

    public Sale[] getVente() {
        return vente;
    }
}
