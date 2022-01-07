package Basics;

public class NumberOfDigits {
  public static void main(String[] args) {

  }

  static int numberOfDigits1(int n) {
    int count = 0;

    // Check edge cases
    if (n < 0)
      n *= -1;
    if (n == 0)
      return 1;

    while (n > 0) {
      count++;
      n /= 10;
    }
    return count;
  }

  static int numberOfDigitsOfInteger(int n) {
    // Check edge cases
    if (n < 0)
      n *= -1;
    if (n == 0)
      return 1;

    return (int) (Math.log10(n)) + 1;
  }
}
