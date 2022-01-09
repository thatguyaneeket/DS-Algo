// https://www.geeksforgeeks.org/find-a-pair-with-the-given-difference/
package Arrays.oneDimentional;

import java.util.Arrays;

public class FindPairGivenDiff {
  public static void main(String[] args) {
    int[] arr = new int[] { 90, 70, 20, 80, 50 };
    int x = 45;
    System.out.println(findPair2(arr, arr.length, x));
  }

  static boolean findPair1(int[] arr, int n, int x) {
    Arrays.sort(arr);

    for (int i = 0; i < arr.length - 1; i++) {
      int toSearch = Math.abs(x + arr[i]);
      if (binarySearch(arr, i + 1, toSearch))
        return true;
    }
    return false;
  }

  static boolean binarySearch(int[] arr, int start, int x) {
    int end = arr.length - 1;
    int mid;

    while (start <= end) {
      mid = (start + end) / 2;

      if (x == arr[mid])
        return true;
      else if (x > arr[mid]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return false;
  }

  static boolean findPair2(int[] arr, int n, int x) {
    Arrays.sort(arr);
    int i = 0, j = 1;

    while (j < n) {
      if (arr[j] - arr[i] == x)
        return true;
      else if (arr[j] - arr[i] < x) {
        j++;
      } else {
        i++;
      }
    }
    return false;
  }
}
