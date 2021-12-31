package Basics;

import java.util.Scanner;

public class rotateANumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    int k = sc.nextInt();
    sc.close();

    System.out.println(rotateNo(n, k));
  }

  static long rotateNo(long n, int k) {
    long part1, part2;
    int noOfDigits = noOfDigits(n);
    k %= noOfDigits;
    if (k < 0)
      k = noOfDigits + k;
    long divider = (long) Math.pow(10, k);
    part1 = n / divider;
    part2 = n % divider;
    part2 *= Math.pow(10, noOfDigits - k);
    return part2 + part1;
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
