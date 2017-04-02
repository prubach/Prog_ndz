package pl.waw.sgh;

/**
 * Created by prubac on 19.03.2017.
 */
public class TextOper {

    public static void main(String[] adgfgrgs) {
        String s1 = "abcfg";
        String s2 = "def";

        int s1len = s1.length();
        char c1 = s1.charAt(2);
        System.out.println(c1);

        String s3 = s2.concat(s1);
        System.out.println(s3);

        String s4 = s3.substring(1,4);
        System.out.println(s4);

        String s5 = s3.replace("a", "y");
        System.out.println(s5);

        int pozf = s3.indexOf("f");
        System.out.println(pozf);

        //s3.


    }
}
