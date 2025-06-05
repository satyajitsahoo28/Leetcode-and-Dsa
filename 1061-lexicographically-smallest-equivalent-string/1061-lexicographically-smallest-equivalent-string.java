class Solution {
    int parent[];

    public int find(int u) {
        if (u == parent[u]) return u;
        return parent[u] = find(parent[u]);
    }

    public void union(int u, int v) {
        int par_u = find(u);
        int par_v = find(v);

        if (par_u == par_v) return;

        if(par_u < par_v){
            parent[par_v]=par_u;
        }else{
            parent[par_u]=par_v;
        }
    }

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        parent = new int[26];

        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < s1.length(); i++) {
            int u = s1.charAt(i) - 'a';
            int v = s2.charAt(i) - 'a';
            union(u,v);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < baseStr.length(); i++) {
            int ch = baseStr.charAt(i) - 'a';
            sb.append((char) (find(ch) + 'a'));
        }

        return sb.toString();
    }
}
