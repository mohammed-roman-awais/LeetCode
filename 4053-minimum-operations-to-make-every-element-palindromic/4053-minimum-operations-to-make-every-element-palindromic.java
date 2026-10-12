import java.util.*;
class Solution{
    static List<Long>[] p=new ArrayList[2];
    static{
        p[0]=new ArrayList<>();
        p[1]=new ArrayList<>();
        for(int i=1;i<=100000;i++){
            String s=String.valueOf(i);
            String r=new StringBuilder(s).reverse().toString();
            long x=Long.parseLong(s+r);
            p[(int)(x%2)].add(x);
            String t=s.substring(0,s.length()-1);
            String q=new StringBuilder(t).reverse().toString();
            long y=Long.parseLong(s+q);
            p[(int)(y%2)].add(y);
        }
        p[0].sort(Long::compare);
        p[1].sort(Long::compare);
    }
    public long minOperations(int[] nums){
        long ans=0;
        for(int x:nums){
            List<Long> a=p[x%2];
            int l=0,r=a.size();
            while(l<r){
                int m=(l+r)/2;
                if(a.get(m)<x)l=m+1;
                else r=m;
            }
            long d=Long.MAX_VALUE;
            if(l<a.size())d=a.get(l)-x;
            if(l>0)d=Math.min(d,(long)x-a.get(l-1));
            ans+=d/2;
        }
        return ans;
    }
}