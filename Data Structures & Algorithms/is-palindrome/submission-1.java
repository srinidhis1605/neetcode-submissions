class Solution {
    public boolean isPalindrome(String s) {
       int l=0;
       int r = s.length()-1;
       String st = s.toLowerCase();
       while(l<r){
        while(l<r && !Character.isLetterOrDigit(st.charAt(l))){
            l++;
        }
        while(l<r && !Character.isLetterOrDigit(st.charAt(r))){
            r--;
        }
       
       if(st.charAt(l)!=st.charAt(r)){
        return false;
       }  
       l++;
       r--;
       }
       return true;
    }
}
