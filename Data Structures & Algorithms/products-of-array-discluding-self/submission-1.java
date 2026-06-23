class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        int prd=1;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            prd = prd * nums[i];}
            if(nums[i]==0){
                cnt++;
            }
        }
        //int[] res = new int[nums.length];
        if(cnt>1){
            return res;
        }
        for(int i=0;i<nums.length;i++){
            if(cnt>0){
                if(nums[i]==0){
                    res[i]=prd;
                }
            }
            else{
                res[i] = prd/nums[i];
            }    
        }

        return res;
    }
}  
