class Solution {
    public int myAtoi(String s) {
        int num=0, l=s.length();
        int i=0,flag=1;
        while(i<l){
            char ch=s.charAt(i);
            if(ch==' '){
                i++;
            }else{
                break;
            }
        }
        if(i<l && s.charAt(i)=='-'){
            flag=-1;
            i++;
        }else if(i<l && s.charAt(i)=='+'){
            flag=1;
            i++;
        }
        while(i<l && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            if(num>(Integer.MAX_VALUE-digit)/10){
                return flag==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            num=num*10+digit;
            i++;
        }
        return flag*num;
    }
}