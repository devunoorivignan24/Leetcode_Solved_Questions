class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }else{
                int a=hm.getOrDefault(nums[i],0)+1;
                hm.put(nums[i],a);
            }
        }
        res=nums[0];
        for(int key: hm.keySet()){
            if(hm.get(key)>hm.get(res)){
                res=key;
            }
        }
        return res;
    }
}