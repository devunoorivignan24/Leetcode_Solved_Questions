class Solution {
    public boolean backspaceCompare(String s, String t) {
        return backSpace(s).equals(backSpace(t));
    }
    private String backSpace(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                sb.append(s.charAt(i));
            }else if(sb.length()!=0){
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}