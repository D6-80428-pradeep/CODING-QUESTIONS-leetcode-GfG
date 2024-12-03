public class Solution {
    public int FirstUniqChar(string s) {
      var dis= new Dictionary<char,int>();
     
     foreach(var ss in s){
        if(dis.ContainsKey(ss)){
            dis[ss]++;
        }
        else{
            dis[ss]=1;
        }
     }
     for(var i=0;i<s.Length;i++){
        if(dis[s[i]]==1){
            return i;
        }
     }
      return -1;
    }
}
