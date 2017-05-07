package pl.waw.sgh.figury;

/**
 * Created by prubac on 23.04.2017.
 */
public class Kolo extends Figura implements LiczenieObwodu {

    public Kolo(double promien) {
        super(promien, 0);
    }

    public double policzPole() {
        return Math.PI*Math.pow(parA,2);
    }

    //@Override
    public double policzObwod() {
        return 2*Math.PI*parA;
    }
}
