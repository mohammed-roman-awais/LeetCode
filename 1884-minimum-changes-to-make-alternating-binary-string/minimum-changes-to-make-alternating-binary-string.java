class Solution {
    public int minOperations(String s) {
        int changeStart0 = 0; // pattern 010101...
        int changeStart1 = 0; // pattern 101010...
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(i % 2 == 0){
                if(c != '0') changeStart0++;
                if(c != '1') changeStart1++;
            } 
            else{
                if(c != '1') changeStart0++;
                if(c != '0') changeStart1++;
            }
        }
        
        return Math.min(changeStart0, changeStart1);
    }
}