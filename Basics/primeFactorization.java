package Basics;

import java.util.Scanner;

public class primeFactorization {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    primeFactors(n);
  }

  static void primeFactors(int n) {
    for (int i = 2; i * i <= n; i++) {
      while (n % i == 0) {
        System.out.print(i + " ");
        n /= i;
      }
    }
    System.out.print(n);
  }
}
