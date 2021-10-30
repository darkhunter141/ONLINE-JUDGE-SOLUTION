package problems;

import java.util.Scanner;

public class uri_1007 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a= inp.nextInt();
        int b= inp.nextInt();
        int c= inp.nextInt();
        int d= inp.nextInt();
        int value2 =  (a * b) - (c * d);
        System.out.println("DIFERENCA = "+value2);

    }
}
