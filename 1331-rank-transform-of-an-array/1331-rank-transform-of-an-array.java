class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int ann[]=arr.clone();
        HashMap<Integer,Integer>map=new HashMap<>();
        Arrays.sort(ann);
        int rank=1;
        for(int i=0;i<ann.length;i++){
            if(!map.containsKey(ann[i])){
                map.put(ann[i],rank);
                rank++;
            }
        }
        int result[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i]=map.get(arr[i]);
        }
        return result;
    }
}