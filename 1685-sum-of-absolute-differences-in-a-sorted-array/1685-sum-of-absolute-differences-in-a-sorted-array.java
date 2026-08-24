class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        int totalSum=0;
        for(int num:nums) totalSum+=num;
        int prefixSum=0;
        for(int i=0;i<n;i++){
            int current=nums[i];
            int left=current*i-prefixSum;
            int right=(totalSum-prefixSum-current)-current*(n-i-1);
            result[i]=left+right;
            prefixSum+=current;
        }
        return result;
    }
}