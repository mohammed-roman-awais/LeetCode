class Solution {
    public int tribonacci(int n) {
        int t0=0,t1=1,t2=1,t;
        if(n==0){
            return t0;
        }
        else if(n==1){
            return t1;
        }
        else if(n==2){
            return t2;
        }
        else{
            n=n-2;
            while(n>0){
                t=t0+t1+t2;
                t0=t1;
                t1=t2;
                t2=t;
                n=n-1;
            }
            return t2;
        }
    }
}