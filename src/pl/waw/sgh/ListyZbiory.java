package pl.waw.sgh;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by prubac on 07.05.2017.
 */
public class ListyZbiory {

    public static void main(String[] args) {
        List<String> listaStr = new ArrayList<>();
        listaStr.add("abcd");
        listaStr.add("bcddc");
        listaStr.add("afgregt");

        if (listaStr.contains("abcd"))
            System.out.println("Zawiera abcd");
        listaStr.remove(2);

        for (int i=0;i<listaStr.size();i++) {
            System.out.println(listaStr.get(i));
        }

        List<Long> listaL = new ArrayList<>();
        listaL.add(234L);
        listaL.add(564L);

        Set<Double> zbior = new HashSet<>();
        zbior.add(4345.56);
        zbior.add(3535.45);
        zbior.add(3866.45);

        for (Long ll : listaL)
            zbior.add(Double.valueOf(ll));

        Double suma = 0d;
        for (Double d : zbior){
            System.out.println(d);
            suma += d;
        }
        System.out.println("suma: " + suma);







    }
}
