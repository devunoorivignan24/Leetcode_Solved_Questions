class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer,Map<Integer,Integer>> map=new HashMap<>();
        for(int[] time:times){
            map.putIfAbsent(time[0],new HashMap<>());
            map.get(time[0]).put(time[1],time[2]);
        }
        
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(int[] a,int[] b){
                return a[1]-b[1];
            }                                                                                  
        }  );
        pq.add(new int[]{k,0});
        boolean[] vis=new boolean[n+1];
        int res=0;
        while(!pq.isEmpty()){
            int[] rv=pq.remove();
            int curr=rv[0];
            int time=rv[1];
            if(vis[curr]){
                continue;
            }
            vis[curr]=true;
            res=time;
            n--;
            if(n==0){
                break;
            }
            if(map.containsKey(curr)){
                for(int child: map.get(curr).keySet()){
                    pq.add(new int[]{child, time+ map.get(curr).get(child)});
                } 
            }
        }
        return n==0?res:-1;
    }
}