class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] f=new int[26];
        for(char c:s.toCharArray()) f[c-'a']++;
        int x=0;
        for(int i:f) if(i>0) {
            if(x==0) x=i;
            else if(x!=i) return false;
        }
        return true;
    }
}