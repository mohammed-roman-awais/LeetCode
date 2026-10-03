
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        int n=s.length(),m=p.length();
        if(m>n) return ans;
        int[] a=new int[26],b=new int[26];
        for(int i=0;i<m;i++){
            a[p.charAt(i)-'a']++;
            b[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(a,b)) ans.add(0);
        for(int i=m;i<n;i++){
            b[s.charAt(i)-'a']++;
            b[s.charAt(i-m)-'a']--;
            if(Arrays.equals(a,b)) ans.add(i-m+1);
        }
        return ans;
    }
}
