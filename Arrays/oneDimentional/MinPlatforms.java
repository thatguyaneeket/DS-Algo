package Arrays.oneDimentional;

public class MinPlatforms {
  public static void main(String[] args) {
    int[] arr = new int[] { 900, 940, 950, 1100, 1500, 1800 };
    int[] dep = new int[] { 910, 1200, 1120, 1130, 1900, 2000 };
    System.out.println(minPlatforms(arr, dep, arr.length));
  }

  static int minPlatforms(int[] arr, int[] dep, int n) {
    int maxPlatforms = 0, count = 1;
    for (int i = 0; i < n - 1; i++) {
      count = 1;
      for (int j = i + 1; j < n; j++) {
        if (dep[i] >= arr[j] && dep[j] >= arr[i]) {
          count++;
        }
      }
      if (count > maxPlatforms) {
        maxPlatforms = count;
      }
    }
    return maxPlatforms;
  }
}
