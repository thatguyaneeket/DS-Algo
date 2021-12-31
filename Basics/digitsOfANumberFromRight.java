package Basics;

import java.util.Scanner;

public class digitsOfANumberFromRight {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    sc.close();

    digitsOfNumRev(n);
  }

  static void digitsOfNumRev(long n) {
    int temp;
    while (n > 0) {
      temp = (int) (n % 10);
      System.out.println(temp);
      n /= 10;
    }
  }
}
