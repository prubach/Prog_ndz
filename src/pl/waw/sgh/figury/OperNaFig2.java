package pl.waw.sgh.figury;

/**
 * Created by prubac on 23.04.2017.
 */
public class OperNaFig2 {

    public static void main(String[] args) {

        Figura[] tabFig = new Figura[3];
        tabFig[0] = new Kolo(3);
        tabFig[1] = new Kwadrat(4);
        tabFig[2] = new Prostokat(2,6);

        for (int i=0;i<tabFig.length;i++) {
            String opis = tabFig[i].toString();
            double pole = tabFig[i].policzPole();
            System.out.println(opis);
            System.out.println(pole);
        }

    }
}
