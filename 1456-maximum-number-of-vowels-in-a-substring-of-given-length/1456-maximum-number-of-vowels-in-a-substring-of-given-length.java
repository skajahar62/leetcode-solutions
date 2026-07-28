class Solution {
    public int maxVowels(String s, int k) {
        int count =0;
        for(int i=0;i<k;i++){
            if(isvawel(s.charAt(i))){
                count++;
            }
        }
            int max=count;
            for(int i=k;i<s.length();i++){
                if(isvawel(s.charAt(i))){
                    count++;
                }

                if(isvawel(s.charAt(i-k))){
                    count--;
                }
                max=Math.max(max,count);
            }
            return max;

        }
        private boolean isvawel(char ch){
            return ch =='a'||
                   ch=='e' ||
                   ch=='i' ||
                   ch=='o' ||
                   ch=='u';
        }
    
}