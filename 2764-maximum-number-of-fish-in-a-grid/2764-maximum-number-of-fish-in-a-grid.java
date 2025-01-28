class Solution {
    public int findMaxFish(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxFish = 0;
        boolean[][] visited = new boolean[m][n];
        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        Queue<int[]> queue = new LinkedList<>();
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] > 0 && !visited[i][j]) {
                    int currentFish = 0;
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                    
                    while(!queue.isEmpty()) {
                        int[] curr = queue.poll();
                        currentFish += grid[curr[0]][curr[1]];
                        
                        for(int[] dir : dirs) {
                            int newI = curr[0] + dir[0];
                            int newJ = curr[1] + dir[1];
                            
                            if(newI >= 0 && newI < m && newJ >= 0 && newJ < n 
                               && !visited[newI][newJ] && grid[newI][newJ] > 0) {
                                queue.offer(new int[]{newI, newJ});
                                visited[newI][newJ] = true;
                            }
                        }
                    }
                    maxFish = Math.max(maxFish, currentFish);
                }
            }
        }
        return maxFish;
    }
}