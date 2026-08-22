class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        int[] freq=new int[101];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        int max=0;
        for(int i=1;i<101;i++){
            if(freq[i]>max){
                max=freq[i];
            }
        }
        int cnt=0;
        for(int i=0;i<101;i++){
            if(freq[i]==max){
                cnt+=freq[i];
            }
        }
        return cnt;
    }
}