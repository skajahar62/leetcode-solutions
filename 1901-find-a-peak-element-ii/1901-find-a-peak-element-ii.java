class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;
        int left=0;
        int right=cols-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int maxrow=0;
            for(int i=1;i<rows;i++){
                if(mat[i][mid]>mat[maxrow][mid]){
                    maxrow=i;
                }
            }
                int current=mat[maxrow][mid];
                int leftValue=mid-1>=0 ? mat[maxrow][mid-1]:-1;
                int rightValue=mid+1<cols ? mat[maxrow][mid+1]:-1;

                if(current>leftValue && current >rightValue){
                    return new int[]{maxrow,mid};
                }
                else if(current <leftValue){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
        }
        return new int[]{-1,-1};
    }
}