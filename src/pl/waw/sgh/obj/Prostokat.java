package pl.waw.sgh.obj;

/**
 * Created by prubac on 23.04.2017.
 */
public class Prostokat {
    double bokA;
    double bokB;

    public Prostokat() {
        bokA = 2;
        bokB = 3;
    }

    public Prostokat(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public void ustawParametry(double a, double b) {
        this.bokA = a;
        this.bokB = b;
    }
    public double policzPole() {
        return bokA*bokB;
    }


}
