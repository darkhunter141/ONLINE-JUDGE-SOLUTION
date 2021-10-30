package problems;

import java.text.DecimalFormat;
import java.util.Scanner;

public class uri1012_pro {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        double a = r.nextDouble();
        double b = r.nextDouble();
        double c = r.nextDouble();
        double ra,cr,tra,sq,re2;
        ra = (a*c)/2;
        cr = 3.14159*(c*c);
        tra = ((a+b)*c)/2;
        sq = Math.pow(b,2);
        re2 = a*b;
        DecimalFormat def = new DecimalFormat("#.000");
        System.out.println("TRIANGULO: "+def.format(ra));
        System.out.println("CIRCULO: "+def.format(cr));
        System.out.println("TRAPEZIO: "+def.format(tra));
        System.out.println("QUADRADO: "+def.format(sq));
        System.out.println("RETANGULO: "+def.format(re2));

    }
}
