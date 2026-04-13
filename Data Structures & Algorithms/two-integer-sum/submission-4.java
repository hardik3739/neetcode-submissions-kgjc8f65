class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Set<Integer>map=new HashSet<>();
        Map<Integer,Integer>map=new HashMap<>();
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int k=target-nums[i];

            // if(map.containsKey(nums[i])){
            //     ans[1]=i;
            //     ans[0]=map.get(nums[i]);
            // }
            // map.put(k,i);
             if(map.containsKey(k)){
                ans[1]=i;
                ans[0]=map.get(k);
            }
            map.put(nums[i],i);
        }
        return ans;
        
    }
}
