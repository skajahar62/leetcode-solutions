class Solution {
    public int longestOnes(int[] nums, int k) {
       int low=0;
       int maxco=0;
       int res=0;

       for(int i=0;i<nums.length;i++){

        if(nums[i]==0){
            maxco++;
        }
        while(maxco > k){
            if(nums[low]==0){
                maxco--;
            }
            low++;
        }
        res=Math.max(res,i-low+1);

       }
       return res;
    }
}