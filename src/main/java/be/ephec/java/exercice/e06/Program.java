package be.ephec.java.exercice.e06;

public class Program {
    public static void main(String[] args) {
        // Test en Celsius
        Temperature.TemperatureUnit v = Temperature.TemperatureUnit.Celsius;
        Temperature u = new Temperature(10, v);
        u.afficher(v);

        //Test en Farenheit
        v= Temperature.TemperatureUnit.Farenheit;
        u = new Temperature(23,v);
        u.afficher(v);

    }
}
