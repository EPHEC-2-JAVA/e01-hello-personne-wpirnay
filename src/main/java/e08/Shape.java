package e08;

public abstract class Shape {
    public int x;
    public int y;
    protected double rotation;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract void affiche();
    public abstract void efface();
}