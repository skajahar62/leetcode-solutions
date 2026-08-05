class Solution {
    public int characterReplacement(String s, int k) {
            int freq[]=new int[26];
            int left=0;
            int maxf=0;
            int maxl=0;
            for(int right=0;right<s.length();right++){
                freq[s.charAt(right)-'A']++;

                maxf=Math.max(maxf,freq[s.charAt(right)-'A']);

                while((right-left+1)-maxf>k){
                    freq[s.charAt(left)-'A']--;
                    left++;
                }
                maxl=Math.max(maxl,right-left+1);
            }
            return maxl;
    }
}