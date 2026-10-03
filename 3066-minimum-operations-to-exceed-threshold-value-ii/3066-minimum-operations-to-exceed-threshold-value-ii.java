class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>();

        for(int num:nums){
            pq.add((long)num);
        }
        int operation=0;
        while(pq.peek()<k){
            long x=pq.poll();
            long y=pq.poll();
            long newValue= Math.min(x,y) * 2+Math.max(x,y);
            pq.add(newValue);
             operation++;
        }
        return operation;
    }
}    