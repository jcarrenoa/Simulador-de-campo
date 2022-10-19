package geoesxpofisica;

public class carga {

    int x, y;
    double charge;
    boolean positive;

    public carga(int x, int y, double charge, String positive) {
        this.positive = !positive.equals("Negativa");
        if (this.positive) {
            this.charge = charge * Math.pow(10, -9);
        } else {
            this.charge = -1 * charge * Math.pow(10, -9);
        }
        this.x = x;
        this.y = y;
    }
    
}
