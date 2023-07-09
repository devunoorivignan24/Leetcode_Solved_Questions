class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                al.add(nums[i]);
            }
        }
        int length=nums.length-al.size();
        for(int i=1;i<=length;i++){
            al.add(0);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=al.get(i);
        }
    }
}