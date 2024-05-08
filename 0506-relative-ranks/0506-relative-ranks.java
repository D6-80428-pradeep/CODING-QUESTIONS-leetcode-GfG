class Solution {
    public String[] findRelativeRanks(int[] score) {
        int l=score.length;
        String[] ans=new String[l];
        List<Integer>list=new ArrayList<>();
        int t=0;
        for(int i:score){
             list.add(i);
        }
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
        for(int i=0;i<l;i++){
            int index=list.indexOf(score[i]);
            System.out.println(index);
            if(index==0){
                ans[i]="Gold Medal";
            }else
            if(index==1){
                ans[i]="Silver Medal";
            }else
            if(index==2){
                ans[i]="Bronze Medal";
            }else{
                ans[i]=Integer.toString(index+1);
            }
            
        }
        return ans;
    }
}