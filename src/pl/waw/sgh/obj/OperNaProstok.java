package pl.waw.sgh.obj;

/**
 * Created by prubac on 23.04.2017.
 */
public class OperNaProstok {

    public static void main(String[] args) {
        Prostokat p1 = new Prostokat();
        Prostokat p2 = new Prostokat(5, 6);
        p1.ustawParametry(23.4, 45);
        double pole = p1.policzPole();
        System.out.println("Pole p1: " + pole);
        System.out.println("Pole p2: " + p2.policzPole());

    }
}
