package geoesxpofisica;

public class vectorU {

    double norma;
    double iu, ju;

    public vectorU(double i, double j) {
        norma = Math.sqrt(Math.pow(i, 2) + Math.pow(j, 2));
        iu = i / norma;
        ju = j / norma;
    }
}
