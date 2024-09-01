import java.util.*;
class Solution {
   private static final int kMax = 2000000000;
   public List<List<Integer>> modifiedGraphEdges(int n, List<List<Integer>> edges, int source, int destination, int target) {
       List<List<int[]>> graph = new ArrayList<>();
       for (int i = 0; i < n; ++i) {
           graph.add(new ArrayList<>());
       }
       for (List<Integer> edge : edges) {
           int u = edge.get(0);
           int v = edge.get(1);
           int w = edge.get(2);
           if (w == -1)
               continue;
           graph.get(u).add(new int[] {v, w});
           graph.get(v).add(new int[] {u, w});
       }
       int distToDestination = dijkstra(graph, source, destination);
       if (distToDestination < target)
           return new ArrayList<>();
       if (distToDestination == target) {
           for (List<Integer> edge : edges)
               if (edge.get(2) == -1)
                   edge.set(2, kMax);
           return edges;
       }
       for (int i = 0; i < edges.size(); ++i) {
           int u = edges.get(i).get(0);
           int v = edges.get(i).get(1);
           int w = edges.get(i).get(2);
           if (w != -1)
               continue;
           w = 1;
           graph.get(u).add(new int[] {v, 1});
           graph.get(v).add(new int[] {u, 1});
           distToDestination = dijkstra(graph, source, destination);
           if (distToDestination <= target) {
               w += target - distToDestination;
               for (int j = i + 1; j < edges.size(); ++j)
                   if (edges.get(j).get(2) == -1)
                       edges.get(j).set(2, kMax);
               edges.get(i).set(2, w);
               return edges;
           }
       }
       return new ArrayList<>();
   }
   private int dijkstra(List<List<int[]>> graph, int src, int dst) {
       int[] dist = new int[graph.size()];
       Arrays.fill(dist, Integer.MAX_VALUE);
       PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
       dist[src] = 0;
       minHeap.offer(new int[] {dist[src], src});
       while (!minHeap.isEmpty()) {
           int[] top = minHeap.poll();
           int d = top[0], u = top[1];
           if (d > dist[u])
               continue;
           for (int[] neighbor : graph.get(u)) {
               int v = neighbor[0], w = neighbor[1];
               if (d + w < dist[v]) {
                   dist[v] = d + w;
                   minHeap.offer(new int[] {dist[v], v});
               }
           }
       }
       return dist[dst];
   }
}