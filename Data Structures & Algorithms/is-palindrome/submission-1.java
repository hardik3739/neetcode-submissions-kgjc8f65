class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            // if(ch!=' '){
            //     sb.append(ch);
            // }else if(ch==' '){
            //     continue;
            // }
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        return ispalidrome(sb.toString());

    }
    public static boolean ispalidrome(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            char chl=s.charAt(l);
            char chr=s.charAt(r);
            if(chl!=chr){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
