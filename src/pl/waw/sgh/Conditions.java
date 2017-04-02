package pl.waw.sgh;

import java.util.DoubleSummaryStatistics;

/**
 * Created by prubac on 19.03.2017.
 */
public class Conditions {

    public static int ii = 6;

    public static void main(String[] args) {
        //String s1 = "abc";
        //String s2 = "def";

        boolean p = false;
        boolean q = true;

        boolean r = p || q; // OR
        boolean t = !(p && !q); // NOT   AND

        System.out.println("p=" + p);
        System.out.println("q=" + q);
        System.out.println("r=" + r);
        System.out.println("t=" + t);

        //int i = 5;
        {
            int i = 5;
            System.out.println(i);
            {
                //int ii = 5;

                System.out.println(ii);
                int j = 7;
                System.out.println(j);
            }
            //System.out.println(j);
        }
        //System.out.println(j);

        if (ii < 8) {
            System.out.println("ii mniejsze od 8");
            System.out.println();
        }
        else {
            System.out.println("ii nie jest mniejsze od 8");
        }

        String s = "B";

        switch (s) {
            case "A":
                System.out.println("s jest A");
                System.out.println();
                //break;
            case "B":
                System.out.println("s jest B");
                //break;
            default:
                System.out.println("s nie jest ani A ani B");
        }

        int ab = (s.equals("A") ? 10 : 20);
        // przypisanie wartości w zależności od ... true potem false
        System.out.println("ab=" + ab);


        Integer a = 5;
        Integer b = 5;

        b = 87;
        b -= 82;

        String sc = "5";

        String s1 = a.toString();
        System.out.println("s1=" +s1);
        int k = 45;
        String s2 = ""+k;
        System.out.println("s2="+s2);
        String s3 = Integer.valueOf(k).toString();
        System.out.println("s3=" + s3);

        String s4 = "4545.546";
        double d1 = Double.valueOf(s4);

        double d2 = Double.parseDouble(s4);

        System.out.println("d1=" + d1);

        System.out.println("d2=" + d2);




        // ==  - prymitywne typy
        // .equals() - porównanie wg wartości
        // !=
        // > < >= <=

        if (a.equals(b)) {
            System.out.println("a=b");
        }




    }
}
