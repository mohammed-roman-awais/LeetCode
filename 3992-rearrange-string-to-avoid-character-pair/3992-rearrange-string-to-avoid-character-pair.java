class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder a=new StringBuilder();
        StringBuilder b=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c==y) a.append(c);
            else if(c==x) b.append(c);
            else a.append(c);
        }
        return a.append(b).toString();
    }
}