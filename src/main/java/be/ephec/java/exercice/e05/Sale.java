package be.ephec.java.exercice.e05;

public class Sale {
    Car voit;
    public Sale (Car voit){
        this.voit=voit;
    }
    public void computeRealPrice(double reduc){
        double ristourne =voit.getPrixCatal()*reduc;

        voit.setPrix(voit.getPrixCatal()-ristourne);
    }
    public String Afficher(){
        return "Le véhicule de marque: "+voit.getMarque()+", modèle : "+voit.getModele()+", N° de série : "+voit.getNumSerie()
                +"\n est vendu au prix de : "+voit.getPrixCatal()+" €.";
    }
}
