class Solution {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();

        for (int i = 0; i <= s.length() - a.length(); i++)
            if (s.startsWith(a, i)) A.add(i);

        for (int i = 0; i <= s.length() - b.length(); i++)
            if (s.startsWith(b, i)) B.add(i);

        for (int i : A) {
            for (int j : B) {
                if (Math.abs(i - j) <= k) {
                    ans.add(i);
                    break;
                }
                if (j > i + k) break;
            }
        }
        return ans;
    }
}