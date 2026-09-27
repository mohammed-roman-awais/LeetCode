class Solution {
    public boolean canMakeSquare(char[][] grid) {
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                int b=0;
                for(int x=i;x<i+2;x++){
                    for(int y=j;y<j+2;y++){
                        if(grid[x][y]=='B') b++;
                    }
                }
                if(b>=3||b<=1) return true;
            }
        }
        return false;
    }
}