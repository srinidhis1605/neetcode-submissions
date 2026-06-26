class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=matrix.length;
        int r = matrix[0].length-1;
        int ans=0;
        for(int i=0;i<l;i++){
            if(target >=matrix[i][0] && target<=matrix[i][r]){
                return binarysearch(matrix[i],target);
            }
        }
        /*
        if(ans!=-1) return true;
        else return false;*/
        return false;
    }
    public boolean binarysearch(int[] mat ,int target){
        int top=0;
        int bot = mat.length-1;
        while(top<=bot){
        int mid = top+(bot-top)/2;
        if(mat[mid]>target){
            bot=mid-1;
        }
        else if(mat[mid]<target){
            top=mid+1;
        }
        else{
            return true;}
        }
        return false;
    }
}
