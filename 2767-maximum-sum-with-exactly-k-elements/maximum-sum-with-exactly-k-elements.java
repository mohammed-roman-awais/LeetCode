class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int t=nums[nums.length-1],ans=0;
        // for(int i=0;i<k;i++){
        //     ans+=t;
        //     t=t+1;
        // }
        // return ans;
        return k*t+(k*(k-1))/2;
    }
}