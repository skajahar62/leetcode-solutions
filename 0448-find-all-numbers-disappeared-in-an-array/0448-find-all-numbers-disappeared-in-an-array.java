class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

    //  HashSet<Integer>set=new HashSet<>();
    //  for(int i=0;i<nums.length;i++){
    //     set.add(nums[i]);
    //  }
    //  List<Integer>list=new ArrayList<>();
    //  for(int i=1;i<nums.length+1;i++){
    //     if(!set.contains(i)){
    //         list.add(i);
    //     }
    //  }
    //  return list;
    // optimal solition


    for(int i=0;i<nums.length;i++){
        int index=Math.abs(nums[i])-1;
        nums[index]= -Math.abs(nums[index]);
    }
    List<Integer>res=new ArrayList<>();
    for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
            res.add(i+1);
        }
    }
    return res;
    }
}