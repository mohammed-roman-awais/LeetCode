class Solution {
    public int countRotations(String s, int k) {
        int n=s.length();
        int same=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==s.charAt((i+1)%n)){
                same++;
            }
        }
        if(k==same){
            return n-same;
        }
        if(k==same-1){
            return same;
        }
        return 0;
    }
}