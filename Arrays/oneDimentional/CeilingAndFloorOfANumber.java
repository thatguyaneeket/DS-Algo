package Arrays.oneDimentional;

public class CeilingAndFloorOfANumber {
  public static void main(String[] args) {
    int[] arr = new int[] { -4, -2, 6, 19, 34, 56, 79, 98, 123 };
    int target = 124;
    System.out.println(floorOfNumber(arr, arr.length, target));
    System.out.println(ceilingOfNumber(arr, arr.length, target));
  }

  static int ceilingOfNumber(int[] arr, int n, int target) {
    int end = n - 1, start = 0, mid;

    if (target >= arr[end])
      return -1;

    while (start <= end) {
      mid = start + (end - start) / 2;

      if (arr[mid] == target) {
        return target;
      } else if (arr[mid] < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return start;
  }

  static int floorOfNumber(int[] arr, int n, int target) {
    int end = n - 1, start = 0, mid;

    while (start <= end) {
      mid = start + (end - start) / 2;

      if (arr[mid] == target) {
        return target;
      } else if (arr[mid] < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return end;
  }
}
