class Solution {
    public boolean equalFrequency(String word) {
       HashMap<Character,Integer>map=new HashMap<>();
       for(char ch:word.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
       }
       for(char ch:map.keySet()){
        map.put(ch,map.get(ch)-1);
       
       int common=0;
       boolean valid=true;
       for(int freq:map.values()){
        if(freq ==0){
            continue;
        }
        if(common==0){
            common=freq;
        }
        else if(common != freq){
            valid=false;
            break;
        }
       }
       
        if(valid){
            return true;
        }
       map.put(ch,map.get(ch)+1);
       }
       return false;
    }
}