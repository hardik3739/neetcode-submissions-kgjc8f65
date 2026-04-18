class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int res []=new int[temperatures.length];
        int n=temperatures.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(temperatures[j]>temperatures[i] && i!=j){
                    res[i]=j-i;
                    break;
                }
            }
        }
        return res;
    }
}
