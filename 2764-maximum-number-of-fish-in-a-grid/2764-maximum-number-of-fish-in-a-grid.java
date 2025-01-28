class Solution {
    public int findMaxFish(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxFish = 0;

        // Iterate through each cell in the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If the cell is a water cell, perform DFS to find the total fish in the connected region
                if (grid[i][j] > 0) {
                    int currentFish = dfs(grid, i, j);
                    maxFish = Math.max(maxFish, currentFish);
                }
            }
        }

        return maxFish;
    }

    // DFS function to explore all reachable water cells and sum the fish
    private int dfs(int[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;

        // Check if the current cell is out of bounds or not a water cell
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) {
            return 0;
        }

        // Collect the fish in the current cell
        int fish = grid[i][j];
        // Mark the cell as visited by setting it to 0
        grid[i][j] = 0;

        // Explore all four adjacent cells
        fish += dfs(grid, i + 1, j);
        fish += dfs(grid, i - 1, j);
        fish += dfs(grid, i, j + 1);
        fish += dfs(grid, i, j - 1);

        return fish;
    }
}