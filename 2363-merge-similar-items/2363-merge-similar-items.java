class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int[] arr = new int[1001];
        for (int[] item : items1) {
            arr[item[0]] += item[1];
        }
        for (int[] item : items2) {
            arr[item[0]] += item[1];
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            if (arr[i] != 0) {
                ans.add(Arrays.asList(i, arr[i]));
            }
        }
        return ans;
    }
}