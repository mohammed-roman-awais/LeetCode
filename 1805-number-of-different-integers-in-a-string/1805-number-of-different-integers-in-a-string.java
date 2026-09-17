class Solution {
    public int numDifferentIntegers(String word) {
        HashSet<String> set = new HashSet<>();
        int i = 0;
        while (i < word.length()) {
            if (Character.isDigit(word.charAt(i))) {
                int j = i;
                while (j < word.length() &&
                       Character.isDigit(word.charAt(j))) {
                    j++;
                }
                while (i < j - 1 && word.charAt(i) == '0') {
                    i++;
                }
                set.add(word.substring(i, j));
                i = j;
            } else {
                i++;
            }
        }
        return set.size();
    }
}