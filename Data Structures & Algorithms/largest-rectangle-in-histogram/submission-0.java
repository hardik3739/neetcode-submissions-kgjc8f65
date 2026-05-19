class Solution {
    public int largestRectangleArea(int[] heights) {
        int max=0;
        for(int i=0;i<heights.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=i;j<heights.length;j++){
                min=Math.min(heights[j],min);
                int width=j-i+1;
                int curarea=width*min;
                max=Math.max(curarea,max);
            }
        }
        return max;
    }
}
