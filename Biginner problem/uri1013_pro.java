package problems;

import java.util.Scanner;

public class uri1013_pro {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int a = r.nextInt();
        int b = r.nextInt();
        int c = r.nextInt();
        int p =((a + b + (a - b)) / 2);
        System.out.println(p);

    }
}
