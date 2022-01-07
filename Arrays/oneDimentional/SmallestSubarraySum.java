// https://www.geeksforgeeks.org/minimum-length-subarray-sum-greater-given-value/
package Arrays.oneDimentional;

public class SmallestSubarraySum {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 4 };
    int x = 8;

    System.out.println(smallestSubarray(arr, arr.length, x));
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
}
