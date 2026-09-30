import java.util.*;
class Solution {
    public int[] sortByReflection(int[] nums) {
        Integer[] arr=new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr,(x,y)->{
            int rx=reflect(x);
            int ry=reflect(y);
            if(rx!=ry){
                return Integer.compare(rx,ry);
            }
            return Integer.compare(x,y);
        });
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        return nums;
    }
    public int reflect(int n){
        int result=0;
        while(n>0){
            result=(result<<1)|(n&1);
            n>>=1;
        }
        return result;
    }
}