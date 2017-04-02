package pl.waw.sgh;

/**
 * Created by prubac on 02.04.2017.
 */
public class Tablice2D {

    public static void main(String[] args) {
        Double[][] tab2D = new Double[3][3];
        tab2D[0][0] = 232.23;
        tab2D[0][1] = 565.34;
        tab2D[1] = new Double[] { 12.56, 252.76, 767.54};
        tab2D[2] = new Double[] { 342.93, 67.34, 324.345};

        for (int i=0;i<tab2D.length;i++) {
            for (int j=0;j<tab2D[i].length;j++) {
                System.out.print(tab2D[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
