package pl.waw.sgh;

/**
 * Created by prubac on 02.04.2017.
 */
public class Tablice2D {

    public static void main(String[] args) {
        Double[][] tab2D = new Double[3][3];
        tab2D[0][0] = 232.23;
        tab2D[0][1] = 565.34;
        tab2D[0][2] = 100.0;
        tab2D[1] = new Double[] { 12.56, 252.76, 767.54};
        tab2D[2] = new Double[] { 342.93, 67.34, 324.345};
        double[] tab2DsumWierszy = new double[3];
        double[] tab2DsumKol = new double[3];


        for (int i=0;i<tab2D.length;i++) {
            for (int j=0;j<tab2D[i].length;j++) {
                System.out.print(tab2D[i][j] + "\t");
                tab2DsumWierszy[i]=tab2DsumWierszy[i]+tab2D[i][j];
                tab2DsumKol[j]=tab2DsumKol[j]+tab2D[i][j];
            }
            System.out.print("|\t" + tab2DsumWierszy[i]);
            System.out.println();
        }
        System.out.println("------------------------:");
        for (Double d : tab2DsumKol) {
            System.out.print(d + "\t");
        }

    }
}
