package problems;

import java.text.DecimalFormat;
import java.util.Scanner;

public class uri_1010pro {
    public static void main(String[] args) {
        double[] a = new double[3];
        Scanner b = new Scanner(System.in);
        a[0]=b.nextDouble();
        a[1]=b.nextDouble();
        a[2]=b.nextDouble();
        double [] d = new double[3];
        Scanner e = new Scanner(System.in);
        d[0]=e.nextDouble();
        d[1]=e.nextDouble();
        d[2]=e.nextDouble();
        double m = (a[1]*a[2])+(d[1])*d[2];
        DecimalFormat def = new DecimalFormat("#.00");
        System.out.println("VALOR A PAGAR: R$ "+def.format(m));

    }
}
