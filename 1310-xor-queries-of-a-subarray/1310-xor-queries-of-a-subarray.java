class Solution {

    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            int ans = arr[left];
            for (int j = left + 1; j <= right; j++) {
                ans ^= arr[j];
            }

            result[i] = ans;
        }
        return result;
    }
}
