class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int c[]=new int[26];
        
        for(int i=0;i<s.length();i++){
            char chs=s.charAt(i);
            char cht=t.charAt(i);
            c[chs-'a']++;
            c[cht-'a']--;
        }

        for(int i=0;i<c.length;i++){
            if(c[i]!=0){
                return false;
            }
        }
        return true;
    }
}
