class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n=t.length;
        int[] res=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && t[st.peek()]<t[i]){
                res[st.peek()]=(i-st.peek());
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            res[st.peek()]=0;
            st.pop();
        }
        return res;
    }
}