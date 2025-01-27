class Solution {
    public int maximumInvitations(int[] favorite) {
         int n = favorite.length;
        int[] inDegree = new int[n];
        for (int f : favorite) {
            inDegree[f]++;
        }
        // Topological sort to process nodes with in-degree 0
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        int[] depth = new int[n];
        Arrays.fill(depth, 1);
        while (!queue.isEmpty()) {
            int u = queue.poll();
            int v = favorite[u];
            depth[v] = Math.max(depth[v], depth[u] + 1);
            inDegree[v]--;
            if (inDegree[v] == 0) {
                queue.offer(v);
            }
        }

        int maxCycle = 0;
        int sumTwoCycles = 0;
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) continue;
            int cycleLength = 0;
            int j = i;
            while (inDegree[j] != 0) {
                inDegree[j] = 0;
                cycleLength++;
                j = favorite[j];
            }
            if (cycleLength == 2) {
                sumTwoCycles += depth[i] + depth[favorite[i]];
            } else {
                maxCycle = Math.max(maxCycle, cycleLength);
            }
        }

        return Math.max(maxCycle, sumTwoCycles);
    }
}