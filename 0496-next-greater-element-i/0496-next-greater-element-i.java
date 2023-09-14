class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        Deque<Integer> stack=new ArrayDeque<>();
        for(final int num:nums2){
            while(!stack.isEmpty() && num>stack.peek()){
                hm.put(stack.pop(),num);
            }
            stack.push(num);
        }
        for(final int num:nums1){
            if(hm.containsKey(num)){
                res.add(hm.get(num));
            }else{
                res.add(-1);
            }
        }
        int[] res1=new int[nums1.length];
        int i=0;
        for(int num:res){
            res1[i++]=num;
        }
        return res1;
    }
}