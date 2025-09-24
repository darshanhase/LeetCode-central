class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
  
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            int temp;
            if (nums1[i] > nums2[j]) {
                temp = nums1[i];
                nums1[k] = temp;
                i--;
            } else {
                temp = nums2[j];
                nums1[k] = temp;
                j--;
            }
            k--;
        }

        while (j >= 0) {
            int temp = nums2[j];
            nums1[k] = temp;
            j--;
            k--;
        }
    }



}
