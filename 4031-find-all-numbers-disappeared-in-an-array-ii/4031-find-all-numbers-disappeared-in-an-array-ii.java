class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        boolean[] appeared=new boolean[100001];
        int n=nums.length;
        for(int i=0;i<n;i++){
            appeared[nums[i]]=true;
        }
        int st=-1,end=-1,sean=-1,preSt=-1,preEnd=-1;
        List<List<Integer>> list=new ArrayList<>();
        for(int i=lower;i<=upper;i++){
            if(appeared[i]==false && sean==-1){
                st=i;
                sean=1;
            }
            if((appeared[i]==true && i>lower && appeared[i-1]==false)){
                end=i-1;
                sean=-1;
            }else if(i==upper && st!=preSt){
                end=i;
                sean=-1;
            }
            if(st!=preSt && end!=preEnd){
                List<Integer> row=new ArrayList<>();
                row.add(st);
                row.add(end);
                list.add(row);
                preSt=st;
                preEnd=end;
            }
        }
        return list;
    }
}