// https://www.geeksforgeeks.org/equilibrium-index-of-an-array/
package Arrays.oneDimentional;

public class EquilibriumIndex {
  public static void main(String[] args) {
    int[] arr = new int[] { -7, 1, 5, 2, -4, 3, 0 };
    System.out.println(equilibriumIndex(arr, arr.length));
  }

  static int equilibriumIndex(int[] arr, int n) {
    int leftSum = arr[0], sum = 0, rightSum;
    for (int i : arr) {
      sum += i;
    }
    for (int i = 1; i < arr.length - 1; i++) {
      rightSum = sum - leftSum - arr[i];
      if (leftSum == rightSum)
        return i;
      leftSum += arr[i];
    }
    return -1;
  }
}
