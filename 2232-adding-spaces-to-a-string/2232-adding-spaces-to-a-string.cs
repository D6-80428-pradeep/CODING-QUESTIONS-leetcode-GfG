public class Solution {
    public string AddSpaces(string s, int[] spaces) {
        var sb = new StringBuilder();
        int spaceIndex = 0; 
        int n = spaces.Length; 

        for (int i = 0; i < s.Length; i++)
        {
            if (spaceIndex < n && i == spaces[spaceIndex])
            {
                sb.Append(" "); 
                spaceIndex++;
            }
            sb.Append(s[i]);
        }

        return sb.ToString();
    }
}