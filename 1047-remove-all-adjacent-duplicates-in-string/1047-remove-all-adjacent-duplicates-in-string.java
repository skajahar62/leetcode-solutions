class Solution {
    public String removeDuplicates(String s) {
        // StringBuilder str=new StringBuilder();
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(str.length()>0 && str.charAt(str.length()-1)==ch){
        //         str.deleteCharAt(str.length()-1);
        //     }
        //     else{
        //         str.append(ch);
        //     }
        // }
        // return str.toString();


        // using Stsck
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && st.peek()==ch){
                st.pop();
            }
            else{
                st.push(ch);
            }

        }
        StringBuilder result=new StringBuilder();
        while(!st.isEmpty()){
            result.append(st.pop());
        }
        return result.reverse().toString();
    }
}