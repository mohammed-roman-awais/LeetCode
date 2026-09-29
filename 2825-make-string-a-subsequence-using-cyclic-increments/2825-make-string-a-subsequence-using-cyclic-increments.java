class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int j = 0;
        for (int i = 0; i < str1.length() && j < str2.length(); i++) {
            char c = str1.charAt(i);
            char next = c == 'z' ? 'a' : (char)(c + 1);
            if (c == str2.charAt(j) || next == str2.charAt(j)) {
                j++;
            }
        }
        return j == str2.length();
    }
}