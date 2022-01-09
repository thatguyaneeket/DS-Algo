// https://www.geeksforgeeks.org/minimum-length-subarray-sum-greater-given-value/
package Arrays.oneDimentional;

public class SmallestSubarraySum {
  public static void main(String[] args) {
    int[] arr = { 1, 11, 100, 1, 0, 200, 3, 2, 1, 250 };
    int x = 280;

    System.out.println(smallestSubarray2(arr, arr.length, x));
  }

  static int smallestSubarray(int[] arr, int n, int x) {
    int start = 0, end = 0, minLen = n + 1, sum = 0;
    while (end < n) {

      while (end < n && sum <= x) {
        sum += arr[end];
        end++;
      }

      while (sum > x) {
        if (end - start < minLen) {
          minLen = end - start;
        }

        sum -= arr[start];
        start++;
      }
    }
    return minLen;
  }

  static int smallestSubarray2(int[] arr, int n, int x) {
    int minlen = n + 1, start = 0, end = 0, sum = 0;

    while (end < n) {
      if (sum <= x) {
        sum += arr[end];
        end++;
      } else {
        if (end - start < minlen) {
          minlen = end - start;
        }
        sum -= arr[start];
        start++;
      }
    }
    return minlen;
  }
}
