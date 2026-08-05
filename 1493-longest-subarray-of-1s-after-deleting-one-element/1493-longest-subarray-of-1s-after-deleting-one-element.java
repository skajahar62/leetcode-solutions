class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int res=0;
        int maxl=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                res++;
            }
            while(res>1){
                if(nums[left]==0){
                    res--;
                }
                left++;
            }
            maxl=Math.max(maxl,right-left);
        }
        return maxl;
    }
}