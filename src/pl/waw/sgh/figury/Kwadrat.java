package pl.waw.sgh.figury;

/**
 * Created by prubac on 23.04.2017.
 */
public class Kwadrat extends Figura {

    public Kwadrat(double parA) {
        super(parA, 0);
    }

    //@Override
    public double policzPole() {
        return parA*parA;
    }
}
