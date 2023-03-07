package be.ephec.java.exercice.e07;

public class Card {
    private String color;
    private int value;

    public Card(String color, int value) {
        this.color = color;
        this.value = value;
    }

    @Override
    public String toString() {
        if (value == 11) {
            return "valet "+color;
        }
        else if (value == 12) {
            return "reine "+color;}
        else if (value == 13) {
            return "roi "+color;
        } else if (value==1) {
            return "as "+color;
        } else return String.valueOf(value)+" "+color;


    }
}
