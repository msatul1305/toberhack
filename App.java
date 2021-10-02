package app;

import java.util.Scanner;

public class App {
    private static Scanner sc;

    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q > 0) {
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          int x = Math.min(a, b);
          int y = Math.min(x, c);
          if (x == y) {
            System.out.println(x);
          } else {
            System.out.println(Math.min(((a + b + c) / 3),x));
          }
          --q;
        }    }
}