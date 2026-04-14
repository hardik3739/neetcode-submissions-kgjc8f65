class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int l=0;
        int r=nums.length-1;
        int ans[]=new int[2];
        while(l<r){
            // int mid=l+(r-l)/2;
            int s=nums[l]+nums[r];

            if(s==target){
                ans[0]=l+1;
                ans[1]=r+1;
                break;
            }
             if(s<target){
                l++;
            }else{
                r--;
            }

        }
        return ans;

    }
}
