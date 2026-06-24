class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r = heights.length-1;
        int arr=0;
        int Maxar=0;
        while(l<r){
            arr = Math.min(heights[l],heights[r])*(r-l);
            if(Math.min(heights[l],heights[r])==heights[l]){
                l++;
            }
            else{
                r--;
            }
            Maxar = Math.max(Maxar , arr);
        }
        return Maxar;
    }
}
