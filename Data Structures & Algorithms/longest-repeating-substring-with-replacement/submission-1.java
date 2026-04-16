class Solution {
    public int characterReplacement(String s, int k) {
        int start=0;
        int end=0;
        int n=s.length();
        int maxc=0;
        int len=0;
        int kc=0;
        int maxf=0;
        HashMap<Character,Integer>map=new HashMap<>();

        while(end<n){
            char ch=s.charAt(end);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxf=Math.max(maxf,map.get(ch));
            // if(!map.containsKey(ch)){
            //     map.put(ch,map.getOrDefault(ch,0)+1);
            //     kc++;
            // }
            while((end-start+1)-maxf>k){
                char chl=s.charAt(start);
                map.put(chl,map.get(chl)-1);
                start++;
            }
            maxc=Math.max(maxc,end-start+1);
            end++;
        }
        return maxc;
    }
}
