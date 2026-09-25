class Solution {
    public boolean validTicTacToe(String[] board) {
        int x=0,o=0;
        for(String s:board) for(char c:s.toCharArray()) {
            if(c=='X') x++;
            if(c=='O') o++;
        }
        if(o>x||x>o+1) return false;
        boolean xw=win(board,'X'),ow=win(board,'O');
        if(xw&&ow) return false;
        if(xw&&x!=o+1) return false;
        if(ow&&x!=o) return false;
        return true;
    }
    public boolean win(String[] b,char c) {
        for(int i=0;i<3;i++) {
            if(b[i].charAt(0)==c&&b[i].charAt(1)==c&&b[i].charAt(2)==c) return true;
            if(b[0].charAt(i)==c&&b[1].charAt(i)==c&&b[2].charAt(i)==c) return true;
        }
        return b[0].charAt(0)==c&&b[1].charAt(1)==c&&b[2].charAt(2)==c||b[0].charAt(2)==c&&b[1].charAt(1)==c&&b[2].charAt(0)==c;
    }
}