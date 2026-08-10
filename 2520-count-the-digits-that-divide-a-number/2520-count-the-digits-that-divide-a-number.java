class Solution {
    public int countDigits(int num) {
        int n=num,cnt=0;
        while(num>0){
            int r=num%10;
            if(n%r==0) cnt++;
            num=num/10;
        }
        return cnt;
    }
}