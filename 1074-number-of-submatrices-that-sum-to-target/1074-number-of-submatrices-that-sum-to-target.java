class Solution{
    public int numSubmatrixSumTarget(int[][] matrix,int target){
        int m=matrix.length,n=matrix[0].length;
        int[][] p=new int[m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                p[i+1][j+1]=matrix[i][j]+p[i][j+1]+p[i+1][j]-p[i][j];
            }
        }
        int ans=0;
        for(int r1=0;r1<m;r1++){
            for(int r2=r1;r2<m;r2++){
                HashMap<Integer,Integer> map=new HashMap<>();
                map.put(0,1);
                int sum=0;
                for(int c=0;c<n;c++){
                    sum+=p[r2+1][c+1]-p[r1][c+1]-p[r2+1][c]+p[r1][c];
                    ans+=map.getOrDefault(sum-target,0);
                    map.put(sum,map.getOrDefault(sum,0)+1);
                }
            }
        }
        return ans;
    }
}