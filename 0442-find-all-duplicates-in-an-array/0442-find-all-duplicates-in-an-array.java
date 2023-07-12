class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        List<Integer> temp=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(hs.add(nums[i])){
                
            }else{
                temp.add(nums[i]);
            }
        }
        return temp;
    }
}