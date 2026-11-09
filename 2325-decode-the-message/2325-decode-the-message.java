class Solution {
    public String decodeMessage(String key, String message) {
        char[] map = new char[26];
        boolean[] used = new boolean[26];
        int i = 0;
        for (char c : key.toCharArray()) {
            if (c != ' ' && !used[c - 'a']) {
                used[c - 'a'] = true;
                map[c - 'a'] = (char)('a' + i++);
            }
        }
        StringBuilder ans = new StringBuilder();
        for (char c : message.toCharArray())
            ans.append(c == ' ' ? ' ' : map[c - 'a']);
        return ans.toString();
    }
}