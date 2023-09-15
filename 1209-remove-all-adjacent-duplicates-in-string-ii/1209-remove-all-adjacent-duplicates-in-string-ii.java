class Solution {
    public String removeDuplicates(String s, int k) {
        LinkedList<Item> stack=new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && stack.peek().c==ch){
               ++stack.peek().freq;
            }else{
                stack.push(new Item(ch,1));
            }
            if(stack.peek().freq==k){
                stack.pop();
            }
        }
        while(!stack.isEmpty()){
           Item item=stack.pop();
            for(int i=0;i<item.freq;i++){
                sb.append(item.c);
            }
        }
        return sb.reverse().toString();
    }
}
class Item{
    char c;
    int freq;
    public Item(char c,int freq){
        this.c=c;
        this.freq=freq;
    }
}