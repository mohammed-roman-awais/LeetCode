class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.toLowerCase().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.length() > 2) {
                sb.append(Character.toUpperCase(word.charAt(0)));
                sb.append(word.substring(1));
            } else {
                sb.append(word);
            }

            if (i != words.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}