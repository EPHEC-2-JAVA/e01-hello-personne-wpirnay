package be.ephec.java.exercice.e06;

import org.jetbrains.annotations.NotNull;

public class Temperature {
    protected double tempCel;
    protected double tempFar;
    //protected String unite;
    protected enum TemperatureUnit{Celsius, Farenheit};
    public Temperature(int val, @NotNull TemperatureUnit u){
        if(u==u.Celsius){
            tempCel=val;
            tempFar = (double)(val*(9.0/5.0)+32);
        }
        else {
            tempFar = val;
            tempCel = (double) ((val - 32) * (5.00 / 9.00));
        }
    }
    public double getValue(@NotNull TemperatureUnit u) {
        if (u==u.Celsius) {
            return tempCel;
        } else {
            return tempFar;
        }
    }
    public double getTempInverse (@NotNull TemperatureUnit u){
        if (u==u.Celsius){return tempFar;}
        else {return tempCel;}
    }
    public TemperatureUnit getValInverse(@NotNull TemperatureUnit u){
        if(u==u.Celsius){return u.Farenheit;}
        else return u.Celsius;
    }
    public void setValue (int nb, @NotNull TemperatureUnit u){
        if(u==u.Celsius){
            tempCel=nb;
            tempFar = (double)(nb*(9.0/5.0)+32);
        }
        else {
            tempFar = nb;
            tempCel = (double) ((nb - 32) * (5.00 / 9.00));
        }
    }
    public void afficher(TemperatureUnit u){
        System.out.println("Valeur encodée: " + getValue(u) + " " + u.toString() + "\nValeur en "+getValInverse(u).toString()+ " : " + getTempInverse(u) + " " + getValInverse(u).toString());
    }

}
