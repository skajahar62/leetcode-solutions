class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=nums[0];
        for(int num : nums){
            max=Math.max(max,num);
        }

        int left=0;
        int countmax=0;
        long ans=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==max){
                countmax++;
            }
            while(countmax>=k){
                if(nums[left]==max){
                    countmax--;
                }
                left++;
            }
            ans+=left;
        }
        return ans;
    }
}