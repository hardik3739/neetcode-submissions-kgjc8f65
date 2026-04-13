class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer>maps=new HashMap<>();
        Map<Character,Integer>mapt=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            maps.put(ch,maps.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            mapt.put(ch,mapt.getOrDefault(ch,0)+1);
        }

         for(int i=0;i<t.length();i++){
            char ch=s.charAt(i);
            if(maps.get(ch).equals(mapt.get(ch))){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
