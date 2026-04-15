class Solution {
    public int trap(int[] height) {
        int l=0;
        int ans=0;
        int r=height.length-1;
        int leftm=0;
        int rightm=0;
        while(l<r){
            if(height[l]>leftm){
                leftm=height[l];
            }
            if(height[r]>rightm){
                rightm=height[r];
            }
            if(leftm<rightm){
                ans+=leftm-height[l];
                l++;
            }else{
                ans+=rightm-height[r];
                r--;
            }
            // l++;
            // r--;

            
        }
        return ans;
    }
}
