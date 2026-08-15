class Solution {

    public boolean dfs(int u,int v,boolean[] visited,List<List<Integer>> adj){
        if(u == v) return true;
        visited[u] = true;

        for(int n : adj.get(u)){
            if(!visited[n]){
                if(dfs(n,v,visited,adj)) return true;
            }
        }
        return false;
    }

    public int[] findRedundantConnection(int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i <= edges.length;i++) adj.add(new ArrayList<>());

        for(int[] i : edges){
            int u = i[0];
            int v = i[1];

            boolean[] visited = new boolean[edges.length+1];
            if(dfs(u,v,visited,adj)) return i;

            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        return new int[2];
    }
}