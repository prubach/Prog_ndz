package pl.waw.sgh.figury;

/**
 * Created by prubac on 23.04.2017.
 */
public class Prostokat extends Figura {

    public Prostokat(double parA, double parB) {
        super(parA, parB);  // wywołanie konstruktora nadklasy z 2 parametrami
    }

    public double policzPole() {
        return parA*parB;
    }
}
