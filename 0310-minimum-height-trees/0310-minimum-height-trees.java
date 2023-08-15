class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res=new ArrayList<>();
        //conditions if number of nodes are zero or one
        if(n==0)return res;
        if(n==1){
            res.add(0);
            return res;
        }
        //adjacency list for graph
        List<List<Integer>> adj=new ArrayList<>();
        //array to store the degree for every vertex
        int[] degree=new int[n];
        //initializing the adjaceny list
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        //updating the graph and degree values
        for(int[] e:edges){
            degree[e[0]]++;
            degree[e[1]]++;
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        //BFS approach
        Queue<Integer> q=new LinkedList<>();
        //noting down the single node values inside  the queue
        for(int i=0;i<n;i++){
            if(degree[i]==1){
                q.add(i);
            }
        }
        
        while(n>2){
            int size=q.size();
            n-=size;
            
            while(size-->0){
                int v=q.poll();
                //decementing the degree value
                for(int i: adj.get(v)){
                    degree[i]--;
                    if(degree[i]==1){
                        q.add(i);
                    }
                }
            }
        }
        res.addAll(q);
        return res;
        }
}