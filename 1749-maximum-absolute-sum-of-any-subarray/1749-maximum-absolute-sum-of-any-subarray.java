class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxEnding=nums[0];
        int minEnding=nums[0];

        int maxsum=nums[0];
        int minsum=nums[0];
        for(int i=1;i<nums.length;i++){
            maxEnding=Math.max(
                nums[i],
                maxEnding+nums[i]
            );

            minEnding=Math.min(
                nums[i],
                minEnding +nums[i]
            );
            maxsum=Math.max(
                maxsum,
                maxEnding
            );
            minsum=Math.min(
                minsum,
                minEnding
            );


        }
        return Math.max(
            Math.abs(maxsum),
            Math.abs(minsum)
        );
    }
}