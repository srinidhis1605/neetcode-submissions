class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ione = 0;
        int itwo = numbers.length-1;
        while(ione<itwo){
        if(numbers[ione]+numbers[itwo] == target){
            return new int[]{ione+1 , itwo+1};
        }
        if(numbers[ione]+numbers[itwo] > target){
            itwo--;
        }
        if(numbers[ione]+numbers[itwo] < target){
            ione++;
        }
        }
        return new int[]{};
    }
}
