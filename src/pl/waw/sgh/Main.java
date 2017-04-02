package pl.waw.sgh;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        System.out.println("Witam łóżąśćć");

        int a;
        a = 5;

        int b = a;
        b = ++a;


        System.out.println("a=" + a);
        System.out.println("b=" + b);

        Integer aa = 9;
        Integer bb = aa;

        bb++;

        System.out.println("aa=" + aa);
        System.out.println("bb=" + bb);

        String s1 = "abc";
        String s2 = new String("abc");

        BigDecimal bg1 = new BigDecimal(0).setScale(2, BigDecimal.ROUND_HALF_DOWN);

        System.out.println(bg1);

        BigDecimal bg2 = new BigDecimal(324.5).setScale(2, BigDecimal.ROUND_HALF_DOWN);

        bg2 = bg2.add(bg1);

        System.out.println("BG2: " + bg2);

        //s2 += "def";

        /*
        Komentarz

         */


        System.out.println(s1);
        System.out.println(s2);




    }
}
