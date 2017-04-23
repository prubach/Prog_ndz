package pl.waw.sgh.figury;

/**
 * Created by prubac on 23.04.2017.
 */
public class OperNaFigurach {

    public static void main(String[] args) {
        Figura f1 = new Figura();
        String opis = f1.toString();
        System.out.println(opis);

        Prostokat p1 = new Prostokat(4,6);
        double pole = p1.policzPole();
        System.out.println(p1.toString());
        System.out.println("Pole p1: " + pole);

        Kolo k1 = new Kolo(2);
        double poleKola = k1.policzPole();
        System.out.println("Pole k1: " + poleKola);

    }
}
