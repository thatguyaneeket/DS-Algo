package Basics;

import java.util.Scanner;

public class PythagoreanTriplet {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    sc.close();

    pythagoreanTriplet(a, b, c);
  }

  static void pythagoreanTriplet(int a, int b, int c) {
    a *= a;
    b *= b;
    c *= c;

    int max = a;
    if (b >= max) {
      max = b;
    }
    if (c >= max) {
      max = c;
    }

    if (max == a) {
      boolean flag = (a == (b + c));
      System.out.println(flag);
    } else if (max == b) {
      boolean flag = (b == (a + c));
      System.out.println(flag);
    } else {
      boolean flag = (c == (b + a));
      System.out.println(flag);
    }
  }
}
