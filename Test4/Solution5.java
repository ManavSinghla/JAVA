import java.util.*;
public class Solution5 {
    public int secondMinimum(int n, int[][] edges, int time, int change) {
        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        int[][] dist = new int[n + 1][2];
        for (int i = 1; i <= n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{1, 0});
        dist[1][0] = 0;
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int node = curr[0];
            int currTime = curr[1];
            for (int neighbor : graph[node]) {
                int nextTime = currTime;
                if ((nextTime / change) % 2 == 1) {
                    nextTime = (nextTime / change + 1) * change;
                }
                nextTime += time;
                if (nextTime < dist[neighbor][0]) {
                    dist[neighbor][1] = dist[neighbor][0];
                    dist[neighbor][0] = nextTime;
                    queue.offer(new int[]{neighbor, nextTime});
                }
                else if (nextTime > dist[neighbor][0] && nextTime < dist[neighbor][1]) {
                    dist[neighbor][1] = nextTime;
                    queue.offer(new int[]{neighbor, nextTime});
                }
            }
        }
        return dist[n][1];
    }
}