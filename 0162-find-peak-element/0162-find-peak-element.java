class Solution {
    public int findPeakElement(int[] nums) {  
        if(nums.length==1){
            return 0;
        }
        if(nums.length==2){
            if(nums[0]>nums[1])return 0;
            else return 1;
        }
        int res=0;
        for(int i=1;i<nums.length-1;i++){
                if(nums[i]>nums[i+1] && nums[i]>nums[i-1]){
                    res=i;
                }  
        }
        if(res==0){
            if(nums[0]>nums[1])return 0;
            else return nums.length-1;
        }
        return res;
    }
}