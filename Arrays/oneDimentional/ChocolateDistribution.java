// https://www.geeksforgeeks.org/chocolate-distribution-problem/
package Arrays.oneDimentional;

import java.util.Arrays;

public class ChocolateDistribution {
  public static void main(String[] args) {
    int[] arr = new int[] { 12, 4, 7, 9, 2, 23, 25, 41,
        30, 40, 28, 42, 30, 44, 48,
        43, 50 };
    int k = 7;
    System.out.println(distribute(arr, arr.length, k));
  }

  static int distribute(int[] arr, int n, int k) {
    int i = 0, j = k - 1, minDiff = Integer.MAX_VALUE;

    Arrays.sort(arr);

    while (j < n) {
      if (arr[j] - arr[i] < minDiff) {
        minDiff = arr[j] - arr[i];
      }
      i++;
      j++;
    }
    return minDiff;
  }
}
