class Solution {
    public int lengthOfLastWord(String s) {
        int ch=s.length()-1;
        while(ch >=0 && s.charAt(ch)== ' '){
            ch--;
        }
        int count=0;
        while(ch>=0 && s.charAt(ch) != ' '){
            count++;
            ch--;
        }
        return count;
    }
}