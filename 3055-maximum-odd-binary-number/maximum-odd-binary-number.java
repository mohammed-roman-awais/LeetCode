class Solution {
    public String maximumOddBinaryNumber(String s) {
        int countOnes = 0;
        // Count number of '1's
        for (char c : s.toCharArray()) {
            if (c == '1') {
                countOnes++;
            }
        }
        int n = s.length();
        StringBuilder result = new StringBuilder();
        // Add remaining (countOnes - 1) ones at the beginning
        for (int i = 0; i < countOnes - 1; i++) {
            result.append('1');
        }
        // Add zeros in the middle
        for (int i = 0; i < n - countOnes; i++) {
            result.append('0');
        }
        // Add one '1' at the end to make it odd
        result.append('1');
        return result.toString();
    }
}