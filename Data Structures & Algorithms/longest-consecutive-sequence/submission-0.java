class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        int maxlen=0;
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i]-1)){
            int l=1;
            while(hs.contains(nums[i] + l)){
            l++;
            }
            maxlen=Math.max(l,maxlen);
        }
    }
        return maxlen;
    }
}
