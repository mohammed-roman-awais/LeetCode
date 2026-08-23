class Solution {
    public boolean isPalindromic(String s) {
        int l=s.length();
        int[] a=new int[8*l];
        int n=a.length;
        int idx=n-1;
        for(int i=0;i<l;i++){
            int val=(int)s.charAt(i);
            int bits=0;
            while(val>0){
                int r=val%2;
                a[idx]=r;
                val=val/2;
                idx--;
                bits++;
            }
            while(bits!=8){
                idx--;
                bits++;
            }
        }
        int st=0,end=n-1;
        while(st<end){
            if(a[st]!=a[end]){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}