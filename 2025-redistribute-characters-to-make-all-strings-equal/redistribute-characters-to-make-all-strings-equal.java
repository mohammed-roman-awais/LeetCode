class Solution {
    public boolean makeEqual(String[] words) {
        int[] freq = new int[26];

        for(String w : words){
            for(char c : w.toCharArray()){
                freq[c - 'a']++;
            }
        }

        for(int f : freq){
            if(f % words.length != 0)
                return false;
        }

        return true;
    }
}