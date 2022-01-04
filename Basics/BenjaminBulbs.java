package Basics;

import java.util.Scanner;

public class BenjaminBulbs {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    benjaminBulbs(n);
  }

  static void benjaminBulbs(int n) {
    int lim = (int) Math.sqrt(n);

    for (int i = 1; i <= lim; i++) {
      System.out.println(i * i);
    }
  }
}
