class Solution {
    public boolean areNumbersAscending(String s) {
        String[] words = s.split(" ");
        int previous = -1;
        for (int i = 0; i < words.length; i++) {
            if (Character.isDigit(words[i].charAt(0))) {
                int current = Integer.parseInt(words[i]);
                if (current <= previous) {
                    return false;
                }
                previous = current;
            }
        }
        return true;
    }
}