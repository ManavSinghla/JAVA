import java.util.*;
public class Solution6 {
    public int reachableNodes(int[][] edges, int maxMoves, int n) {
        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            graph[e[0]].add(new int[]{e[1], e[2]});
            graph[e[1]].add(new int[]{e[0], e[2]});
        }
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[1] - b[1]
        );
        pq.offer(new int[]{0, 0});
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int node = curr[0];
            int currDist = curr[1];
            if (currDist > dist[node]) continue;
            for (int[] nei : graph[node]) {
                int next = nei[0];
                int weight = nei[1] + 1;
                if (currDist + weight < dist[next]) {
                    dist[next] = currDist + weight;
                    pq.offer(new int[]{next, dist[next]});
                }
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (dist[i] <= maxMoves) result++;
        }
        for (int[] e : edges) {
            int u = e[0], v = e[1], cnt = e[2];
            int fromU = Math.max(0, maxMoves - dist[u]);
            int fromV = Math.max(0, maxMoves - dist[v]);
            result += Math.min(cnt, fromU + fromV);
        }
        return result;
    }
}