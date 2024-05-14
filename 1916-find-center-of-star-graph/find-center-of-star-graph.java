class Solution {
  public int findCenter(int[][] edges) {
    Map<Integer, Integer> map = new HashMap<>();
        for (int[] edge : edges) {
            map.put(edge[0], map.getOrDefault(edge[0], 0) + 1);
            map.put(edge[1], map.getOrDefault(edge[1], 0) + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) == edges.length) return key;
        }
        return 0;
  }
}
