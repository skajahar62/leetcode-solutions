class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;
        int maxEnding=nums[0];
        int maxsum=nums[0];
        int minEnding=nums[0];
        int minsum=nums[0];
        for(int i=0;i<nums.length;i++){
            total +=nums[i];

            if(i>0){

            maxEnding=Math.max(
                nums[i],
                maxEnding + nums[i]
            );
            maxsum=Math.max(maxsum,maxEnding);

             minEnding=Math.min(
                nums[i],
                 minEnding + nums[i]
             );
             
             minsum=Math.min(minsum,minEnding);
            }

        }
             if(maxsum<0){
                return maxsum;
             }
               int circular=total-minsum;
               return Math.max(circular,maxsum);
            
    }
}