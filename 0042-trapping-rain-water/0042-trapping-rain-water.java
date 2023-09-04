class Solution {
    public int trap(int[] height) {
        //variables to store length of height array
        final int n=height.length;
        //variable to store total water trapped
        int ans=0;
        // 2 arrays to store left max height and right maximum height
        int[] l=new int [n];
        int[] r=new int[n];
        //traverse through the array from left to right
        for(int i=0;i<n;++i){
            l[i]=(i==0)?height[i]:Math.max(height[i],l[i-1]);
        }
        //traversing through right to left
         for(int i=n-1;i>=0;--i){
            r[i]=(i==(n-1))?height[i]:Math.max(height[i],r[i+1]);
        }
        //calculating the space between the right and left blocks
         for(int i=0;i<n;i++){
            ans+=Math.min(l[i],r[i])-height[i];
        }
        return ans;
    }
}