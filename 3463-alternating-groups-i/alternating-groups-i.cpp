class Solution {
public:
    void helper(vector<int>& colors,int n,int val,int i,int &cnt){
        if(i==n-1){
            if(colors[i]==colors[1] && colors[i]!=colors[0]) cnt++;
        }
        else if(i==n-2){
            if(colors[i]==colors[0] && colors[i]!=colors[i+1]) cnt++;
        }
        else if(colors[i]==colors[i+2] && colors[i]!=colors[i+1]) cnt++;
    }
    int numberOfAlternatingGroups(vector<int>& colors) {
        int n=colors.size(),cnt=0;
        for(int i=0;i<n;i++){
            int val=colors[i];
            helper(colors,n,val,i,cnt);
        }
        return cnt;        
    }
};