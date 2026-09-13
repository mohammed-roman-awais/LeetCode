class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int[][] res=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res[i][(n-rowShift[i]+j)%n]=grid[i][j];
            }
        }
        int[][] ans=new int[n][n];
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                ans[(n-colShift[j]+i)%n][j]=res[i][j];
            }
        }
        return ans;
    }
}