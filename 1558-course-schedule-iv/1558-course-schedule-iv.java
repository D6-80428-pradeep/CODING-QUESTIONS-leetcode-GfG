class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        
 boolean[][] reachable = new boolean[numCourses][numCourses];
        
        // Initialize the adjacency matrix with direct prerequisites
        for (int[] prereq : prerequisites) {
            int a = prereq[0];
            int b = prereq[1];
            reachable[a][b] = true;
        }
        
        // Floyd-Warshall algorithm to compute transitive closure
        for (int k = 0; k < numCourses; k++) {
            for (int i = 0; i < numCourses; i++) {
                for (int j = 0; j < numCourses; j++) {
                    if (reachable[i][k] && reachable[k][j]) {
                        reachable[i][j] = true;
                    }
                }
            }
        }
        
        // Process each query based on the computed reachability matrix
        List<Boolean> answer = new ArrayList<>();
        for (int[] query : queries) {
            int u = query[0];
            int v = query[1];
            answer.add(reachable[u][v]);
        }
        
        return answer;
    }
}