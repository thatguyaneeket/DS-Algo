package Arrays.oneDimentional;

import java.util.Arrays;

public class ReverseArray {
  public static void main(String[] args) {
    int[] arr = new int[] { 1, 2, 4, 7, 67, 32, -1 };
    System.out.println(Arrays.toString(arr));
    revArrayIterative(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void revArrayIterative(int[] arr) {
    int temp, start = 0, end = arr.length - 1;

    while (start < end) {
      temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
}
