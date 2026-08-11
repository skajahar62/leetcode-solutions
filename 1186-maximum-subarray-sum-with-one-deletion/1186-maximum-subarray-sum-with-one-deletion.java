class Solution {
    public int maximumSum(int[] arr) {
        int NoDelete=arr[0];
        int oneDelete=0;
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            int x=arr[i];
            int newoneDelete=Math.max(
                NoDelete,
                oneDelete + x
            );
            int newNoDelete=Math.max(
                x,
                NoDelete + x
            );
            oneDelete=newoneDelete;
            NoDelete= newNoDelete;
            ans=Math.max(ans,Math.max(oneDelete, NoDelete));
        }
        return ans;
    }
}