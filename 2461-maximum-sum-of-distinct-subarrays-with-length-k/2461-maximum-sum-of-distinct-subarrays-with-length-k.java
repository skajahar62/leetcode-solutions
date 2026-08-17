class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int left=0;
        long sum=0;
        long maxsum=0;

        for(int right=0;right<nums.length;right++){
            sum+=nums[right];

            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            if(right-left+1>k){
                int remove=nums[left];
                sum-=remove;
                map.put(remove,map.get(remove)-1);
                if(map.get(remove)==0){
                    map.remove(remove);
                }
                left++;
            }
            if(right-left+1==k && map.size()==k){
                maxsum=Math.max(maxsum,sum);

            }
        }
        return maxsum;
    }
}