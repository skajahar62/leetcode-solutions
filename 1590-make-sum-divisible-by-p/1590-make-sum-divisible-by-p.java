class Solution {
    public int minSubarray(int[] nums, int p) {
        long total=0;
        for(int num:nums){
            total+=num;
        }
        int need=(int)(total%p);
        if(need==0){
            return 0;
        }

        HashMap<Integer,Integer>map=new HashMap<>();
       map.put(0,-1);
        int ans=nums.length;
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int current=(int)(sum%p);
            int target=(current-need+p)%p;
            if(map.containsKey(target)){
                ans=Math.min(ans,i-map.get(target));
            }
            map.put(current,i);
        }
        return ans==nums.length ? -1: ans;
    }
}