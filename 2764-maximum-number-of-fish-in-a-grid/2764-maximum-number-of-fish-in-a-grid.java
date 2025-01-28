class Solution {
    public int findMaxFish(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxFish = 0;
        boolean[][] visited = new boolean[m][n];
        
        // Try each cell as starting point
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] > 0 && !visited[i][j]) {
                    maxFish = Math.max(maxFish, dfs(grid, i, j, m, n, visited));
                }
            }
        }
        return maxFish;
    }
    
    private int dfs(int[][] grid, int i, int j, int m, int n, boolean[][] visited) {
        // Check bounds or if cell is already visited or is land
        if(i < 0 || i >= m || j < 0 || j >= n || visited[i][j] || grid[i][j] == 0) {
            return 0;
        }
        
        visited[i][j] = true;
        int currentFish = grid[i][j];
        
        // Visit all adjacent cells
        currentFish += dfs(grid, i+1, j, m, n, visited); // down
        currentFish += dfs(grid, i-1, j, m, n, visited); // up
        currentFish += dfs(grid, i, j+1, m, n, visited); // right
        currentFish += dfs(grid, i, j-1, m, n, visited); // left
        
        return currentFish;
    }
}