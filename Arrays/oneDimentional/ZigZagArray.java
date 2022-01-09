// https://www.geeksforgeeks.org/convert-array-into-zig-zag-fashion/
package Arrays.oneDimentional;

import java.util.Arrays;

public class ZigZagArray {
  public static void main(String[] args) {
    int[] arr = new int[] { 1, 4, 3, 2 };
    System.out.println(Arrays.toString(zigZag(arr, arr.length)));
  }

  static int[] zigZag(int[] arr, int n) {
    boolean bada = true;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i + 1] > arr[i] != bada) {
        swap(arr, i, i + 1);
      }
      bada = !bada;
    }
    return arr;
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
