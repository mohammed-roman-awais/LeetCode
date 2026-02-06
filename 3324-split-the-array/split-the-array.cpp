class Solution {
public:
    bool isPossibleToSplit(vector<int>& nums) {
        int n=nums.size(),flag=1,cnt=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                    if(cnt>1){
                        flag=0;
                        break;
                    }
                }
            }
            cnt=0;
            if(flag==0){
                return false;
            }
        }
        return true;
    }
};