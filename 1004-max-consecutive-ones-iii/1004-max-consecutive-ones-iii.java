class Solution {
    public int longestOnes(int[] nums, int k) {
        int res=0;
        //loop traversal using 2 pointer method
        for(int l=0,r=0;r<nums.length;r++){
            //if the value is 0 then decrement the value of k
            if(nums[r]==0)--k;
            //condition if the k number ofzeroes are covered
            while(k<0){
                if(nums[l++]==0)++k;
            }
            res=Math.max(res,(r-l+1));    
        }
        
        return res;
    }
}