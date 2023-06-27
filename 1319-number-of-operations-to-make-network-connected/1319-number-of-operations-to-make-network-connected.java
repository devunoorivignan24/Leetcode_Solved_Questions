class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1){
            return -1;
        }
        List<Integer>[] graph=new ArrayList[n];
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int[] connection:connections){
            graph[connection[0]].add(connection[1]);
             graph[connection[1]].add(connection[0]);
        }
        int res=0;
        for(int i=0;i<n;i++){
            if(set.add(i)){
                dfs(i,graph,set);
                ++res;
            }
        }
        return res-1;
    }
    public void dfs(int curr, List<Integer>[] graph,HashSet<Integer> set){
        for(final int v:graph[curr]){
            if(set.add(v)){
                dfs(v,graph,set);
            }
        }
    }
}