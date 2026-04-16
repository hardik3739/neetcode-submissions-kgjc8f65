class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>map=new HashSet<>();

        int start=0;
        int end=0;
        int n=s.length();
        int len=0;
        int maxl=0;
        while(end<n){
            char ch=s.charAt(end);
            if(!map.contains(ch)){
                map.add(ch);
                end++;
                len=end-start;
                maxl=Math.max(maxl,len);
            }else{
                map.remove(s.charAt(start));
                    start++;
            }
        }
        return maxl;

    }
}
