class Solution {
    public List<String> commonChars(String[] words) {
        int minfreq[]=new int[26];
        for(char ch: words[0].toCharArray()){
            minfreq[ch-'a']++;
        }

        for(int i=1;i<words.length;i++){
            int freq[]=new int[26];
            for(char ch:words[i].toCharArray()){
                freq[ch-'a']++;
            }
            for(int j=0;j<26;j++){
                minfreq[j]=Math.min(minfreq[j],freq[j]);
            }
        }
        List<String>res=new ArrayList<>();
        for(int i=0;i<26;i++){
            while(minfreq[i]>0){
                res.add(String.valueOf((char)(i+'a')));
                minfreq[i]--;
            }
        }
        return res;
    }
}