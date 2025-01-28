class Solution {
    class UnionFind {
        int[] parent;
        int[] size;
        int[] fish;
        
        UnionFind(int n) {
            parent = new int[n];
            size = new int[n];
            fish = new int[n];
            for(int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }
        
        int find(int x) {
            if(parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }
        
        void union(int x, int y) {
            int px = find(x);
            int py = find(y);
            if(px != py) {
                if(size[px] < size[py]) {
                    int temp = px;
                    px = py;
                    py = temp;
                }
                parent[py] = px;
                size[px] += size[py];
                fish[px] += fish[py];
            }
        }
    }
    
    public int findMaxFish(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        UnionFind uf = new UnionFind(m * n);
        
        // Initialize fish counts
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] > 0) {
                    uf.fish[i * n + j] = grid[i][j];
                }
            }
        }
        
        // Unite adjacent water cells
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] > 0) {
                    if(i + 1 < m && grid[i + 1][j] > 0) {
                        uf.union(i * n + j, (i + 1) * n + j);
                    }
                    if(j + 1 < n && grid[i][j + 1] > 0) {
                        uf.union(i * n + j, i * n + j + 1);
                    }
                }
            }
        }
        
        // Find maximum fish in any component
        int maxFish = 0;
        for(int i = 0; i < m * n; i++) {
            if(uf.find(i) == i) {
                maxFish = Math.max(maxFish, uf.fish[i]);
            }
        }
        return maxFish;
    }
}