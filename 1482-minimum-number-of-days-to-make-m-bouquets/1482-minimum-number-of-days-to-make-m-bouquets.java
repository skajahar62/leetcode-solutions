class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m * k >bloomDay.length){
            return -1;
        }
        int left=Integer.MAX_VALUE;
        int right=Integer.MIN_VALUE;
        for(int day:bloomDay){
            left=Math.min(left,day);
            right=Math.max(right,day);
        }
        while(left<right){
            int mid=left+(right-left)/2;
            if(canMakebouquets(bloomDay,m,k,mid)){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    private boolean canMakebouquets(int[] bloomDay, int m, int k,int mid){
        int flower=0;
        int bouquet=0;
        for(int bool:bloomDay){
            if(bool<=mid){
                flower++;
                if(flower==k){
                    bouquet++;
                    flower=0;
                }
            }
            else{
                flower=0;
            }
            if(bouquet>=m){
                return true; 
            }
        }
        return false;
    }
}