class Solution {
    public int minDeletions(String s) {
        int[] c=new int[26];
        HashSet<Integer> hs=new HashSet<>();
        int res=0;
        //update the frequency values into the array
        for(final char ch:s.toCharArray()){
            ++c[ch-'a'];
        }
        for(int freq:c){
            while(freq>0 && hs.contains(freq)){
                freq--;
                res++;
            }
           hs.add(freq); 
        }
        
        return res;
    }
}