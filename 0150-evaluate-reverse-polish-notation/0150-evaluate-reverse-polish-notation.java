class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack();
        for(String c:tokens){
            if("+-*/".contains(c)){
                st.push(eval(st.pop(),st.pop(),c));
            }else{
                st.push(Integer.parseInt(c));
            }
        }
        return st.pop();
    }
    private int eval(int a1,int a2,String c){
        if("+".equals(c)){
            return a1+a2;
        }else if("-".equals(c)){
            return a2-a1;
        }else if("*".equals(c)){
            return a1*a2;
        }else{
            return (a2/a1);
        }
    }
}