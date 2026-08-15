class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] parent = new int[edges.length+1];
        for(int i = 1 ; i <= edges.length;i++) parent[i] = i;
        
        for(int[] i : edges){
            int u = i[0];
            int v = i[1];

            int rootu = find(u,parent);
            int rootv = find(v,parent);
            if(rootu == rootv) return i;

            parent[rootv] = rootu;
        }
        return new int[2];
    }

    public int find(int u, int[] parent){
        if(u == parent[u]) return u;
        return find(parent[u],parent);
    }
}
