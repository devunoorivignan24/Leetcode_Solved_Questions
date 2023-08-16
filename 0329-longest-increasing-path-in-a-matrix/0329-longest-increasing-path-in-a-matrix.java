class Solution {
     int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
    public int longestIncreasingPath(int[][] matrix) {
       if(matrix==null || matrix.length==0)return 0;
       int m=matrix.length,n=matrix[0].length;
        int[][] mem=new int[m][n];
        int longestpath=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int path=dfs(matrix,m,n,i,j,mem);
                longestpath=Math.max(path,longestpath);
            }
        }
        return longestpath;
    }
    public int dfs(int[][] matrix,int m,int n,int i,int j,int[][] mem){  
        if(mem[i][j]>0)return mem[i][j];
        int max=0;
        for(int[] a:dir){
             int x=i+a[0];
             int y=j+a[1];
            if(x>=0 && x<m && y>=0 && y<n && matrix[x][y]>matrix[i][j]){
              max=Math.max(max,dfs(matrix,m,n,x,y,mem));
            }
        }
        mem[i][j]=max+1;
        return max+1;
    }
}