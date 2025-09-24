class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int i = 0;
        // int j = 0;

        // while(i < m  && j < n){
        //     if(nums1[i] < nums2[j]){
        //       nums1[i] = nums1[i];
        //         i++; 
        //     }
        //     if(nums2[j] > nums1[i]){

        //         nums1[i] = nums2[j];
        //         j++;
        //     }
        // }

for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        
        Arrays.sort(nums1);
    }
}