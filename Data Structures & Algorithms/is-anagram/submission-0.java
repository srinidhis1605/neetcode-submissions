class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character , Integer> hs = new HashMap<>();
        HashMap<Character , Integer> ht = new HashMap<>();
        for(int i=0;i<s.length();i++){
            int valueS = hs.getOrDefault(s.charAt(i),0)+1;
            hs.put(s.charAt(i),valueS);

            int valueT = ht.getOrDefault(t.charAt(i),0)+1;
            ht.put(t.charAt(i),valueT);
        }
        if(hs.equals(ht)){
            return true;
        }
    return false;
    }
}
