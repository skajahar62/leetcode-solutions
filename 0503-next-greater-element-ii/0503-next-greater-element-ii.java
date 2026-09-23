class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<2*n;i++){
            int current=nums[i%n];
            while(!st.isEmpty() && nums[st.peek()]<current){
                ans[st.pop()]=current;
            }
            if(i<n){
                st.push(i);
            }
        }
        return ans;
    }
}