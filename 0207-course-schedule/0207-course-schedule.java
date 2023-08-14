class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] arr=new ArrayList[numCourses];
        //initializing the array of arraylists
        for(int i=0;i<numCourses;++i){
            arr[i]=new ArrayList();
        }
        //forming a directed graph with the given edges
        for(int[] a:prerequisites){
            arr[a[0]].add(a[1]);
        }
        
        int[] vis=new int[numCourses];
        //traversing through all the edges for detecting the cycle and identifying the path.
        // 0- unvisited
        // 1- visited
        // 2- completed
        for(int i=0;i<numCourses;++i)
            
            if(vis[i]==0 && !dfs(arr,vis,i))
                return false;       
        
       return true; 
    }
    public boolean dfs(ArrayList<Integer>[] arr,int[] vis,int v){
        //condition to check if the vertex is previously visited then it forms a cycle
        if(vis[v]==1){
            return false;
        }
        if(vis[v]==2){
            return true;
        }
        //marking the node as visited
        vis[v]=1;
        //finding the path to the last node of the graph
        for(int temp:arr[v])    
            if(!dfs(arr,vis,temp))return false;
            
        vis[v]=2;
        
        return true;
    }
    
}