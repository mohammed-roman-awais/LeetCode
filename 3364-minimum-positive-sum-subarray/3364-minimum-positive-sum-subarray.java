class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size(),ans=Integer.MAX_VALUE;
        int[] p=new int[n+1];
        for(int i=0;i<n;i++) p[i+1]=p[i]+nums.get(i);
        for(int len=l;len<=r;len++)
            for(int i=0;i+len<=n;i++){
                int sum=p[i+len]-p[i];
                if(sum>0) ans=Math.min(ans,sum);
            }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}