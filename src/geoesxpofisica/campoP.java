package geoesxpofisica;

public class campoP {

    private double xp, yp, xq, yq;
    double i, j;
    double dist, campoe;
    double k = 9 * (Math.pow(10, 9));
    double q;
    vectorU unit;

    public campoP(double xp, double yp, double xq, double yq, double q, boolean positive, int or, boolean camp) {
        this.xp = xp;
        this.yp = yp;
        this.xq = xq;
        this.yq = yq;
        this.q = q;
        dist = Math.sqrt((Math.pow(yp - yq, 2)) + (Math.pow(xp - xq, 2)));
        //Corregir
        /*if (positive) {
            i = xp - xq;
            j = yp - yq;
        } else {
            dist = Math.sqrt(Math.pow(yp - yq, 2) + (Math.pow(xp - xq, 2)));
            i = -1 * (xp - xq);
            j = -1 * (yp - yq);
        }*/
        //unit = new vectorU(i, j);
        campoe = (k * q) / (Math.pow(dist, 2));
        i = campoe * (xp - xq) / dist;
        j = campoe * (yp - yq) / dist;

        /*if (camp) {
            if ((xp - xq) > or) {
                if ((yp - yq) > or) {
                    double angulo = Math.atan((yp - yq) / (xp - xq));
                    i = campoe * Math.cos(angulo);
                    j = campoe * Math.sin(angulo);
                } else {
                    double angulo = Math.atan((yp - yq) / (xp - xq));
                    i = campoe * Math.cos(angulo);
                    j = campoe * Math.sin(angulo);
                }
            }

        }*/

    }

}
