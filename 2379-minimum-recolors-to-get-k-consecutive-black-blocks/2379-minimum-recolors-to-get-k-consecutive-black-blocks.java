class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left=0;
        int right=0;
        int maxcount=0;
        int count=Integer.MAX_VALUE;
        while(right<blocks.length()){
            if(blocks.charAt(right)=='W'){
                maxcount++;
        }
            while(right-left+1 >k){
                if(blocks.charAt(left)=='W'){
                    maxcount--;
                }
                left++;
            }
             if(right-left+1==k){
                count=Math.min(count,maxcount);
             }
            right++;
        }
        return count;
    }
}