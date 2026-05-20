class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxp=0;
        for(int i=0;i<piles.length;i++){
            maxp=Math.max(maxp,piles[i]);
        }
        
        int minp=1;
        while(minp<maxp){
            int mid=minp+(maxp-minp)/2;
            
            if(consuinhrs(piles,h,mid)){
                maxp=mid;
            }else{
                minp=mid+1;
            }
        }
        return minp;
    }
    // important note to incerase the hours we must divide it by small number(mid)
    // important note to decrease the hours we must divide it by large number(mid)
    boolean consuinhrs(int piles[],int h,int mid){
        int hours=0;
        for(int i=0;i<piles.length;i++){
            hours+=(int)Math.ceil((double)piles[i]/mid);
        }
        if(hours<=h){
            return true;
        }
        return false;
    }
}
