class Pair {
    int node;
    int wt;
    Pair(int node, int wt) {
        this.node = node;
        this.wt = wt;
    }
}

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < times.length; i++) {
            int u = times[i][0];
            int v = times[i][1];
            int w = times[i][2];
            adj.get(u).add(new Pair(v, w));
        }

        int dist[] = new int[n + 1];
        for (int i = 0; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[k] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x, y) -> x.wt - y.wt);
        pq.add(new Pair(k, 0));

        while (!pq.isEmpty()) {
            Pair p = pq.remove();
            int s = p.node;
            int w = p.wt;

            for (Pair q : adj.get(s)) {
                int it = q.node;
                int weight = q.wt;

                if (dist[s] + weight < dist[it]) {
                    dist[it] = dist[s] + weight;
                    pq.add(new Pair(it, dist[it]));
                }
            }
        }

        int result = Integer.MIN_VALUE;
        for (int i = 1; i < dist.length; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                return -1;
            }
            result = Math.max(result, dist[i]);
        }
        return result;
    }
}
