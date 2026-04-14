class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
    HashMap<String,List<String>>map=new HashMap<>();
    List<String>res=new ArrayList<>();
    for(int i=0;i<str.length;i++){
        String cur=str[i];
        String freq=getfreq(cur);
        if(map.containsKey(freq)){
            map.get(freq).add(cur);
        }else{
            List<String>nlis=new ArrayList<>();
            nlis.add(cur);
            map.put(freq,nlis);
        }
    }
    return new ArrayList<>(map.values());
    }
    public static String getfreq(String s){
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            char ch=(char)('a'+i);
            if(arr[i]!=0){
                sb.append(ch);
                sb.append(arr[i]);
            }
        }

        return sb.toString();
    }

}
