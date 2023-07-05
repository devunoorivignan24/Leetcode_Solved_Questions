class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,n=s.length();
        int res=0;
        HashSet<Character> hs=new HashSet<>();
        while(i<n && j<n){
            while(j<n){
                if(hs.contains(s.charAt(j))){
                    hs.remove(s.charAt(i));
                    i++;
                }else{
                    hs.add(s.charAt(j));
                    j++;
                    res=Math.max(res,(j-i));      
                }
            }
        }
        return res;
    }
}