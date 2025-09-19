/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 

   public class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();

        //Find peak index
        int peak = findPeak(mountainArr, 0, n - 1);

        //Search in ascending part
        int left = binarySearch(mountainArr, target, 0, peak, true);
        if (left != -1) return left;

        //Search in descending part
        return binarySearch(mountainArr, target, peak + 1, n - 1, false);
    }

    private int findPeak(MountainArray arr, int start, int end) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) < arr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    private int binarySearch(MountainArray arr, int target, int start, int end, boolean ascending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = arr.get(mid);

            if (val == target) return mid;

            if (ascending) {
                if (val < target) start = mid + 1;
                else end = mid - 1;
            } else {
                if (val > target) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}


