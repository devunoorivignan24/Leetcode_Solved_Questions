class Solution {
    public String removeKdigits(String num, int k) {
        if(k==num.length())return "0";
        //initialize stack and string builder objects
        LinkedList<Character> stack=new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<num.length();i++){
            while(k>0 && !stack.isEmpty() && stack.getLast()>num.charAt(i)){
                stack.pollLast();
                --k;
            }
            stack.addLast(num.charAt(i));
        }
        while(k>0){
            stack.pollLast();
            --k;
        }
        for(final char c:stack){
            if(c=='0' && sb.length()==0){
                continue;
            }
            sb.append(c);
        }
        return sb.length()==0 ? "0":sb.toString();
    }
}