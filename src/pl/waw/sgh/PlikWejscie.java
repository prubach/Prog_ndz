package pl.waw.sgh;

import java.io.*;
import java.util.Scanner;

/**
 * Created by prubac on 02.04.2017.
 */
public class PlikWejscie {

    public static void main(String[] args) throws IOException {
        String sciezkaPlik = "h:\\plik.txt";
        //String sciezkaPlik = "h:/plik.txt";
        String sciezka2Plik = "..\\plik.txt";
        String aktKatalog = System.getProperty("user.dir");
        System.out.println("Aktualny: " + aktKatalog);

        String katTemp = System.getProperty("java.io.tmpdir");
        System.out.println("Temp: " + katTemp);

        String katDomowy = System.getProperty("user.home");
        System.out.println("Domowy: " + katDomowy);

        File nowyPlik = new File("h:\\plikwy.txt");
        // drugi param = czy nadpisać
        FileWriter fw = new FileWriter(nowyPlik, false);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Nowy plik");
        bw.newLine();


        //java.io.File plik = new java.io.File(sciezkaPlik);

        File plik = new File(sciezkaPlik);
        Scanner scanner = new Scanner(plik);
        while (scanner.hasNext()) {
            String linia = scanner.nextLine();
            System.out.println(linia);
            bw.write(linia);
        }
        bw.write("Koniec");
        bw.close();
        fw.close();






    }
}
