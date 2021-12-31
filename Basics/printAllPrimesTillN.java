package Basics;

import java.util.Scanner;

public class printAllPrimesTillN {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int low = sc.nextInt();
    int high = sc.nextInt();
    sc.close();

    for (int i = low; i <= high; i++) {
      if (isPrime(i)) {
        System.out.println(i);
      }
    }
  }

  static boolean isPrime(int n) {
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
