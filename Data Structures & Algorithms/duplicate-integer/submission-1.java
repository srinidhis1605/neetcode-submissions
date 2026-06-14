class Solution {
    public boolean hasDuplicate(int[] nums) {
        //boolean[] vist = new boolean[nums.length];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
            
        }
        return false;
         
    }
}