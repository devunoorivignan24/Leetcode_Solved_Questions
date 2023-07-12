class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1;
        while(i<nums.length && j<nums.length){
            if(nums[j]==nums[i]){
               nums[j]=0;
            }else{
                i++;
                nums[i]=nums[j];               
            }
            j++;
        }
        return i+1;
        
    }
}