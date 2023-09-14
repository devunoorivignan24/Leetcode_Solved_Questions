import java.util.*;
public class MinStack {
      private Stack<Integer> st;
       private Stack<Integer> s1;
    public  MinStack() {
            st=new Stack<>();
            s1=new Stack<>();
    }
    
    public void push(int val) {
        int min = val;
        //Checking whether min stack is empty or not and then adding element
         if(!s1.isEmpty() && min > s1.peek()) {
             min = s1.peek();
      }
     st.push(val);
      s1.push(min);
    }
  public void pop() {
       st.pop();
        s1.pop();
    }
  public int top() {
        return st.peek();
    }
       public int getMin() {
        return s1.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */