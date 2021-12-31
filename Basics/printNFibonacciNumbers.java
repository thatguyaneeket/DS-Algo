package Basics;

import java.util.Scanner;

public class printNFibonacciNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    fib(n);
  }

  static void fib(int n) {
    int a = 0, b = 1, c;
    System.out.println(a);
    System.out.println(b);
    for (int i = 2; i < n; i++) {
      c = a + b;
      a = b;
      b = c;
      System.out.println(c);
    }
  }
}
