class Solution {
    List<List<Integer>> ans;
    int[][] graph;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) { 
        ans=new ArrayList<>();
        this.graph=graph;
        List<Integer> path=new ArrayList<>();
        path.add(0);
        dfs(path,0);
        return ans;
    }
    //Depth first traversal approach is used
    //Keep traversing node by node and note down the path and keep backtracking the path
    public void dfs(List<Integer> path,int node){
        if(node==graph.length-1){
            ans.add(new ArrayList(path));
            return;
        }
        for(int i:graph[node]){
            path.add(i);
            dfs(path,i);
            path.remove(path.size()-1);
        }
    }
}