class Solution {
    public int largestAltitude(int[] gain) {
        // int n=gain.length;
        // int temp[]=new int[n];
        // int alt=0;
        // for(int i=0;i<n-1;i++){
        //     alt+=gain[i];
        //     temp[i]=alt;
        // }
        // int ans=0;
        // for(int i=0;i<n;i++){
        //     ans=Math.max(ans,temp[i]);
        // }
        // if(ans>0){
        //     return ans;
        // }
        // else{
        //     return 0;
        // }
        int alti=0;
        int maxalti=0;
        for(int num: gain){
            alti+=num;
            maxalti=Math.max(maxalti,alti);
        }
        return maxalti;
        
    }
}