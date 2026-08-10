class Solution {
    public int findGCD(int[] nums) {
        int max=Arrays.stream(nums).max().getAsInt();
        int min=Arrays.stream(nums).min().getAsInt();
        // gcd(a,b)=gcd(b,a%b);
        while(min!=0){
            int temp=min;
            min=max%min;
            max=temp;
        }
        return max;
    }
}