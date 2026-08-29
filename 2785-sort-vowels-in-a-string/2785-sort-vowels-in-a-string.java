class Solution {
    public String sortVowels(String s) {
        int[] freq = new int[128];
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                freq[c]++;
            }
        }
        StringBuilder ans = new StringBuilder(s);
        int vowel = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                while (freq[vowel] == 0) {
                    vowel++;
                }

                ans.setCharAt(i, (char) vowel);
                freq[vowel]--;
            }
        }
        return ans.toString();
    }
    private boolean isVowel(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'
            || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}