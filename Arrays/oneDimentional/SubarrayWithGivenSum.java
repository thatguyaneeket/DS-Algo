// https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1/#
package Arrays.oneDimentional;

import java.util.ArrayList;

public class SubarrayWithGivenSum {
  public static void main(String[] args) {
    int[] arr = new int[] { 1, 2, 3, 7, 5 };
    System.out.println(subarraySum(arr, arr.length, 12));
  }

  static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
    int start = 0, end = 0, sum = 0;
    ArrayList<Integer> list = new ArrayList<>();

    while (end < n) {

      while (end < n && sum < s) {
        sum += arr[end];
        end++;
      }

      while (sum > s) {
        sum -= arr[start];
        start++;
      }

      if (sum == s) {
        list.add(start + 1);
        list.add(end);
        return list;
      }
    }

    list.add(-1);
    return list;
  }
}
