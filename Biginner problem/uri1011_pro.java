package problems;

import java.text.DecimalFormat;
import java.util.Scanner;

public class uri1011_pro {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double r = a.nextDouble();
        double p = 3.14159;
        double v = (4*p*(r*r*r))/3;
        DecimalFormat def = new DecimalFormat("#.000");
        System.out.println("VOLUME = "+def.format(v));
    }
}
