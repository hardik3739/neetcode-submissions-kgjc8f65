class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer>map1=new HashMap<>();
        
        int n=s1.length();
        int m=s2.length();
        for(int i=0;i<n;i++){
            char ch =s1.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<=m-n;i++){
            Map<Character,Integer>map2=new HashMap<>();
            for(int j=i;j<i+n;j++){
                char ch=s2.charAt(j);
                map2.put(ch,map2.getOrDefault(ch,0)+1);
            }
            if(map1.equals(map2)){
                return true;
            }
        }
        return false;
    }
}
