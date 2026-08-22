class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int ans=-1;
         for(int num:nums){
            int sum=digitssum(num);
            if(map.containsKey(sum)){
                ans=Math.max(ans,num+map.get(sum));
            }
                map.put(sum,Math.max(map.getOrDefault(sum,0),num));
         }
         return ans;
    }
    private int digitssum(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}