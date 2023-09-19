class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        int si=-1,ei=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(si==-1){
                    si=i;
                    ei=i;
                }else{
                    ei=i;
                }
            }
        }
        res[0]=si;
        res[1]=ei;
        return res;
    }
}