class Solution {
    public int findMin(int[] nums) {
        // brute foce solution
        int r=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                r=nums[i];
            }
        }
        return r;
    }
}
