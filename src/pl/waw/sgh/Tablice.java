package pl.waw.sgh;

/**
 * Created by prubac on 02.04.2017.
 */
public class Tablice {

    public static void main(String[] args) {
        int[] tabInt = new int[] { 34, 552, 35, 3525 };
        for (int i=0;i<tabInt.length;i++) {
            System.out.println("Element " + i + " : "
                    + tabInt[i]);
        }

        String[] tabStr = new String[3];
        tabStr[0] = "abc";
        tabStr[1] = "def";
        tabStr[2] = "ghi";

        String sklejony = "";
        // For Each - wykonaj dla każdego elementu tablicy
        for (String s : tabStr) {
            sklejony = sklejony.concat(s);
        }
        System.out.println(sklejony);

        String strDoPodz = "Andrzej,Danuta,Anna,Maria";
        String[] imiona = strDoPodz.split(",");

        for (int j=0;j<imiona.length;j++) {
            System.out.println("Witaj " + imiona[j]);
        }
        //    \t - tabulator
        //    \n - nowa linia (LF)
        //    \r - inny znak nowej linii (CR)
        //    \\ - backslash \

        System.out.println("ab\\cde\taga\nabc");









    }
}
