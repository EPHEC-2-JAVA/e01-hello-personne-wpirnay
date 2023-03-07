package be.ephec.java.exercice.e03;

public class Pascal {
    public static int[][] triangle (int n) {

        if (n <= 0) {
            System.out.println("Arrete, t'es nul");
            return null;
        }
        int[][] triangle = new int[n][];
        triangle[0] = new int[1];
        triangle[0][0] = 1;
        if (n > 1) {
            for (int i = 1; i < n; i++) { //i=les lignes.
                triangle[i] = new int[i + 1];
                triangle[i][0] = 1;
                triangle[i][i] = 1;
                for (int cell = 1; cell < i; cell++) {
                    triangle[i][cell] = triangle[i - 1][cell - 1] + triangle[i - 1][cell];
                }
            }
        }
        return triangle;
    }
}
