class NumMatrix {
    int[][] p;
    public NumMatrix(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        p=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                p[i][j]=matrix[i-1][j-1]+p[i-1][j]+p[i][j-1]-p[i-1][j-1];
            }
        }
    }
    public int sumRegion(int row1,int col1,int row2,int col2) {
        return p[row2+1][col2+1]-p[row1][col2+1]-p[row2+1][col1]+p[row1][col1];
    }
}