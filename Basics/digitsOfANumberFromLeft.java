package Basics;

import java.util.Scanner;

public class digitsOfANumberFromLeft {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    sc.close();

    digitsOfNum(n);
  }

  static void digitsOfNum(long n) {
    int d = noOfDigits(n);
    long divider = (long) Math.pow(10, d - 1);
    int dig;

    while (divider > 0) {
      dig = (int) (n / divider);
      System.out.println(dig);
      n %= divider;
      divider /= 10;
    }
  }

  static int noOfDigits(long n) {
    int count = 0;
    while (n > 0) {
      n /= 10;
      count++;
    }
    return count;
  }
}
