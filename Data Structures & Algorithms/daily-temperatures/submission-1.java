class Solution {
    public int[] dailyTemperatures(int[] tm) {
        Stack<Integer>stack=new Stack<>();
        int res[]=new int[tm.length];
        for(int i=0;i<tm.length;i++){
            
            while(!stack.isEmpty() && tm[stack.peek()]<tm[i]){
                int previdx=stack.pop();
                res[previdx]=i-previdx;
            }
            stack.push(i);
        }
        return res;
    }
}
