class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        long maxsum=0;
        long sum=0;
        for(int i=0;i<k;i++){
            sum+=nums.get(i);
            map.put(nums.get(i),map.getOrDefault(nums.get(i),0)+1);
        }
        if(map.size()>=m){
            maxsum=sum;
        }
        for(int i=k;i<nums.size();i++){
            sum+=nums.get(i);
            map.put(nums.get(i),map.getOrDefault(nums.get(i),0)+1);

            int remove=nums.get(i-k);
            sum-=remove;
            map.put(remove,map.get(remove)-1);
            if(map.get(remove)==0){
                map.remove(remove);
            }
        if(map.size()>=m){
            maxsum=Math.max(maxsum,sum);
        }
        }
        return maxsum;
    }
}