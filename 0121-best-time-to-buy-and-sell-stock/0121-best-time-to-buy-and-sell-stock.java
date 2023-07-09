class Solution {
    public int maxProfit(int[] prices) {
        Stack<Integer> st=new Stack<>();
        int res=0;
        st.push(prices[0]);
        for(int i=1;i<prices.length;i++){
            if(!st.isEmpty() && st.peek()<prices[i]){
                res=Math.max(res,(prices[i]-st.peek()));
            }else{
                st.push(prices[i]);
            }
        }
        return res;
    }
}