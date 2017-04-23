package pl.waw.sgh.figury;

/**
 * Created by prubac on 23.04.2017.
 */
public class Figura {

    double parA;
    double parB;

    public Figura() {
    }

    public Figura(double parA, double parB) {
        //this.ustawParam(parA, parB); - też zadziała
        ustawParam(parA, parB);
    }

    public void ustawParam(double parA, double parB) {
        this.parA = parA;
        this.parB = parB;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "parA=" + parA +
                ", parB=" + parB +
                '}';
    }
}
