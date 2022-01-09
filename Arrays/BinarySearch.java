package Arrays;

public class BinarySearch {
  public static void main(String[] args) {
    int[] sortedArr = new int[] { -4, -2, 6, 19, 34, 56, 79, 98, 123, 456 };
    int target = -4;
    System.out.println(binarySearch(sortedArr, target));
  }

  static int binarySearch(int[] ascArr, int target) {
    int s = 0, e = ascArr.length - 1;
    int mid;

    while (s <= e) {
      mid = s + (e - s) / 2;

      if (ascArr[mid] == target) {
        return mid;
      } else if (ascArr[mid] < target) {
        s = mid + 1;
      } else {
        e = mid - 1;
      }
    }
    return -1;
  }

  static int orderAgnosticBS(int[] arr, int target) {
    int s = 0, e = arr.length - 1;
    int mid;

    boolean isAsc = arr[e] > arr[s];

    while (s <= e) {
      mid = s + (e - s) / 2;

      if (arr[mid] == target) {
        return mid;
      }

      if (isAsc) {
        if (arr[mid] < target) {
          s = mid + 1;
        } else {
          e = mid - 1;
        }
      } else {
        if (arr[mid] > target) {
          s = mid + 1;
        } else {
          e = mid - 1;
        }
      }

    }
    return -1;
  }
}
