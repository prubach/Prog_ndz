package pl.waw.sgh.figury;

/**
 * Created by prubac on 23.04.2017.
 */
public abstract class Figura implements Comparable<Figura> {

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

    public abstract double policzPole();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "parA=" + parA +
                ", parB=" + parB +
                '}';
    }

    @Override
    public int compareTo(Figura figura) {
        Double mojePole = policzPole();
        Double innePole = figura.policzPole();
        return mojePole.compareTo(innePole);
    }
}
