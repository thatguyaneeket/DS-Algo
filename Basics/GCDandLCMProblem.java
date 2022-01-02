package Basics;

import java.util.Scanner;

public class GCDandLCMProblem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();

    GCDandLCM(a, b);
  }

  static void GCDandLCM(int a, int b) {
    int rem;
    int oa = a, ob = b;

    do {
      rem = a % b;
      a = b;
      b = rem;
    } while (rem != 0);

    int hcf = a;
    int lcm = (oa * ob) / hcf;

    System.out.println(hcf);
    System.out.println(lcm);
  }
}
