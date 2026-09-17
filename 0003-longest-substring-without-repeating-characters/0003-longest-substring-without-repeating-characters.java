class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0;
        int count=0;
        int maxcount=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                left=Math.max(left,map.get(ch)+1);
            }
            map.put(ch,i);
            count=i-left+1;
            maxcount=Math.max(count,maxcount);
        }
        return maxcount;
    }
}