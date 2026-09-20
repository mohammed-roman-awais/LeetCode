class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for (int j = i; j < n; j++){ 
                freq[s.charAt(j) - 'a']++;
                int common = 0;
                boolean balanced = true;
                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        if (common == 0) {
                            common = freq[k];
                        } else if (freq[k] != common) {
                            balanced = false;
                            break;
                        }
                    }
                }
                if (balanced) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
}