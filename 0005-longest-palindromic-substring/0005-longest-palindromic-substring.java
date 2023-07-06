class Solution {
    public String longestPalindrome(String s) {
       int start=0,end=0,length=0;
        for(int i=0;i<s.length();i++){
            int odd=expand(i,i,s);
            int even=expand(i,i+1,s);
            
            length=Math.max(odd,even);
            if(length>(end-start)){
                start=i-(length-1)/2;
                end=i+(length)/2;
            }
           
        }
        return s.substring(start,end+1); 
    }
    public int expand(int left,int right,String s){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return (right-left-1);
    }
}