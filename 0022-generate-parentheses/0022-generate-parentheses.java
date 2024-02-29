class Solution {

    public void generate(String ss,int open,int close, List<String>list,int n){

        if(ss.length()==n*2){
            list.add(ss);
            return ;
        }

        if(open<n) {
            generate(ss+"(",open+1,close,list,n);
        }
        if(close<open){
            generate(ss+")",open,close+1,list,n);
        }

    }
    public List<String> generateParenthesis(int n) {

        List<String>list=new ArrayList<>();

        generate("(",1,0,list,n);
        return list;        
    }
}