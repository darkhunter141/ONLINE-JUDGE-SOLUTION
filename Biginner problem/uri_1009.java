package problems;

import java.text.DecimalFormat;
import java.util.Scanner;

public class uri_1009 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        String num = aa.next();
        double a = aa.nextDouble();
        double b = aa.nextDouble();
        double k = a+(b*0.15);
        DecimalFormat def = new DecimalFormat("#.00");
        System.out.println("TOTAL = R$ "+def.format(k));
    }
}
