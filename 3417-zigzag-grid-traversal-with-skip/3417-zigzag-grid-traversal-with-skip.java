class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer>result=new ArrayList<>();
        int row=grid.length;
        int cols=grid[0].length;
            boolean take=true;
        for(int i=0;i<row;i++){

            if(i%2==0){
                for(int j=0;j<cols;j++){
                    if(take){
                        result.add(grid[i][j]);
                    }
                    take= !take;
                }
            }
            else{
                for(int j=cols-1;j>=0;j--){
                    if(take){
                        result.add(grid[i][j]);
                    }
                    take= !take;
                }
            }
        }
        return result;
    }
}