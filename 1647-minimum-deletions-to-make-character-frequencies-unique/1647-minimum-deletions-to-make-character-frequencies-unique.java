class Solution {
    public int minDeletions(String s) {
        int l=s.length();
        int[] freq=new int[26];
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        int deletion=0;
        boolean[] used=new boolean[l+1];
        for(int f:freq){
            while(f>0 && used[f]){
                f--;
                deletion++;
            }
            if(f>0){
                used[f]=true;
            }
        }
        return deletion;
    }
}