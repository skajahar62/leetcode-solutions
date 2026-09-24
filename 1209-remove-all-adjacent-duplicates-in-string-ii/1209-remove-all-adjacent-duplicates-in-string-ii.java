class Solution {
    public String removeDuplicates(String s, int k) {
        char[] stack=new char[s.length()];
        int[] count=new int[s.length()];
        int top=0;
        for(char ch: s.toCharArray()){
            stack[top]=ch;
            if(top>0 && stack[top-1]==ch){
                count[top]=count[top-1] +1;

            }
            else{
                count[top]=1;
            }
            top++;
            if(count[top-1]==k){
                top -=k;
            }
        }
        return new String(stack,0,top);
    }
}