package e09;

public class Cat extends Animal{
    protected String nom = "Chat";

    @Override
    public void makeNoise() {
        System.out.println("Je suis un "+nom+" et je miaule");
    }
}
