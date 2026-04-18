class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        int end=0;
        int start=0;
        int n=s.length();
        int min=Integer.MAX_VALUE;
        int len=0;
        int stidx=0;
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
        }
        int uniq=map.size();
        while(end<n){
            char ch=s.charAt(end);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                    uniq--;
                }
            }
            while(uniq==0){
                len=end-start+1;
                char sch=s.charAt(start);
                if(len<min){
                    min=len;
                    stidx=start;
                }
                if(map.containsKey(sch)){
                    map.put(sch,map.get(sch)+1);
                    if(map.get(sch)>0){
                        uniq++;
                    }
                }
                start++;
            }
            end++;
        }
        if(min==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(stidx,stidx+
        min);
    }
}
