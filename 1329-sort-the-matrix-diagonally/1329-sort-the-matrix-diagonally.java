class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int r=mat.length, c=mat[0].length;
        for(int d=c-1;d>=0;d--){
            int i=0,j=d;
            List<Integer> list=new ArrayList<>();
            while(j<=c-1 && i<=r-1){
                list.add(mat[i][j]);
                i++;
                j++;
            }
            Collections.sort(list); //list.sort(null);
            i=0;j=d;
            int k=0;
            while(j<=c-1 && i<=r-1){
                mat[i][j]=list.get(k);
                i++;
                j++;
                k++;
            }
        }
        for(int d=1;d<=r-1;d++){
            int i=d,j=0;
            List<Integer> list=new ArrayList<>();
            while(j<=c-1 && i<=r-1){
                list.add(mat[i][j]);
                i++;
                j++;
            }
            Collections.sort(list); //list.sort(null);
            i=d;j=0;
            int k=0;
            while(j<=c-1 && i<=r-1){
                mat[i][j]=list.get(k);
                i++;
                j++;
                k++;
            }
        }
        return mat;
    }
}