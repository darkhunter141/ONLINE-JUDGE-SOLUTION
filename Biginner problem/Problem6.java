package problems;

import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args){

        float a, b, m,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c= sc.nextFloat();

        m = (float) ((a/11 * 2) + (b/11 * 3)+(c/11*5));

        System.out.printf("MEDIA = %.5f", m);


    }
}