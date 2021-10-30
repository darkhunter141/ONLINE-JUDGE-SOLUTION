package problems;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1008_2 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        int  num = aa.nextInt();
        double a = aa.nextDouble();
        double b = aa.nextDouble();
        double k = a*b;
        DecimalFormat def = new DecimalFormat("#.00");
        System.out.println("NUMBER = "+num);
        System.out.println("SALARY = U$ "+def.format(k));
    }
}
