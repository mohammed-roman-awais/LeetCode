class Solution {
    public boolean canWinNim(int n) {
        // return n%4!=0;
        int stones=n,maxTake=3;
        return stones % (maxTake + 1) != 0;
    }
}