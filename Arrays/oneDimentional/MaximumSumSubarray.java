package Arrays.oneDimentional;

public class MaximumSumSubarray {
  public static void main(String[] args) {
    int[] arr = new int[] { 1, -2, 1, 1, -2, 1 };
    System.out.println(maxSumSubarr(arr));
  }

  static int maxSumSubarr(int[] arr) {
    if (arr.length == 0)
      return 0;

    int max = Integer.MIN_VALUE;
    int curMax = 0;

    for (int i = 0; i < arr.length; i++) {
      curMax += arr[i];

      if (curMax > max) {
        max = curMax;
      }
      if (curMax < 0) {
        curMax = 0;
      }
    }
    return max;
  }
}
