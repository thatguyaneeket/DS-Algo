package Basics;

import java.util.Scanner;

public class inverseANumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    sc.close();

    System.out.println(inverse(n));
  }

  static long inverse(long n) {
    long inv = 0;
    int temp, i = 1;
    while (n > 0) {
      temp = (int) (n % 10);
      inv += (long) (Math.pow(10, temp - 1) * i);
      i++;
      n /= 10;
    }
    return inv;
  }
}
