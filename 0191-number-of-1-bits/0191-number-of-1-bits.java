class Solution {
    public int hammingWeight(int n) {

        // count++ if only last digit encounterd is 1 and just rightshift it


        int count = 0;
        while(n!=0){
           
           count = count + (n&1);
            n = n>>1;

        }
        return count;
    }
}