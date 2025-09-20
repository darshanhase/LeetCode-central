class Solution {
    public int singleNonDuplicate(int[] nums) {
    // bitwise approach
    
        // int unique = 0;
        // for(int n : nums){
        //     unique ^= n;

        // }
        // return unique;
    
    //binart search why ?? if it perfectly paired each element in pair will be at evenn index


    int low = 0; int high = nums.length -1;

    while(low < high){
        int mid = low + (high - low)/2;

        if(mid%2 == 1) mid--;   // is mid is odd ? make even

        if(nums[mid] == nums[mid+1]){
            low = mid + 2;
        }

        else{
            high = mid;
        }

    }
    return nums[low];
        }



    
    }
