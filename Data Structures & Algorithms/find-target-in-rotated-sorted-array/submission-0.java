class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                    return mid;
                }
            if(nums[left]<=nums[mid]){
                // search in left sorted array
                if(nums[left]<=target && target<nums[mid]){
                    // return Bsearch(nums,target,left,mid-1);
                    right=mid-1;
                }else{
                    // return Bsearch(nums,target,mid+1,right);
                    left=mid+1;
                }

            }else{
               
                if(nums[mid]<target && target<=nums[right]){
                    // return Bsearch(nums,target,mid+1,right);
                    left=mid+1;
                }else{
                    // return Bsearch(nums,target,left,mid-1);
                    right=mid-1;
                }
            }
        }
        return -1;
    }
    //   public int Bsearch(int[] nums, int target,int left,int right) {

    //   }
}
