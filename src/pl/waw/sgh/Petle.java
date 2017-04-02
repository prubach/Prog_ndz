package pl.waw.sgh;

/**
 * Created by prubac on 19.03.2017.
 */
public class Petle {


    public static void main(String[] args) {
        //int i;
        for (int i=0;i<10;i++) {
            if (i==3) continue;
            System.out.println(i);
            if (i==8) break;
        }

        System.out.println();
        for (int i=5;i>0;i--) {
            System.out.println("abc");
        }

        int k = 0;
        while (k<5) {
            System.out.println("k=" +k);
            k++;
        }

        do {
            System.out.println("def");
        } while(347 > 356);
    }
}
