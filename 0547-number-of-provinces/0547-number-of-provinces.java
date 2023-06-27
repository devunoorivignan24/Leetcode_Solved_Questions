class Solution {
    // Depth first search approach is followed
    //All the nodes are individually considered for checking dfs and the 
    //count is increased if the node is not considered previously
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        int nodes=isConnected.length;
        boolean[] vis=new boolean[nodes];
        for(int i=0;i<nodes;i++){
            if(!vis[i]){
                count++;
                dfs(vis,nodes,isConnected,i);
            }
        }
        return count;
    }
    //graph is represented in the form as adjacency matrix
    public void dfs(boolean[] vis,int nodes,int[][] isConnected,int curr){
        vis[curr]=true;
        for(int i=0;i<nodes;i++){
            if(curr!=i && isConnected[curr][i]==1){
                if(!vis[i]){
                    dfs(vis,nodes,isConnected,i);
                }
            }
        }
    }
}