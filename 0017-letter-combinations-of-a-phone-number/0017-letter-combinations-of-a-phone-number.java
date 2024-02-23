class Solution {
    public List<String>list;
    public Map<Character,String>map;
    public StringBuilder sb;

    public void solve(int index,String digits){
        if(index>=digits.length()){
            list.add(sb.toString());
            return;
        }
        char ch=digits.charAt(index);
        String str=map.get(ch);

        for(char c:str.toCharArray()){
            sb.append(c);
            solve(index+1,digits);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    
    public List<String> letterCombinations(String digits) {
    list=new ArrayList<>();
    if(digits.length()==0) return list;
    sb=new StringBuilder();
    map=new HashMap<>();

    map.put('2',"abc");
    map.put('3',"def");
    map.put('4',"ghi");
    map.put('5',"jkl");
    map.put('6',"mno");
    map.put('7',"pqrs");
    map.put('8',"tuv");
    map.put('9',"wxyz");
    
    solve(0,digits);
     return list;
    }
}