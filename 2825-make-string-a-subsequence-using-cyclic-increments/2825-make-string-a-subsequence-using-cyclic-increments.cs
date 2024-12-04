public class Solution {
    public bool CanMakeSubsequence(string str1, string str2) {
        if (string.IsNullOrEmpty(str2))
            return true;

        if (string.IsNullOrEmpty(str1) || str1.Length < str2.Length)
            return false;

        int pointer1 = 0;
        int pointer2 = 0;

        while (pointer1 < str1.Length && pointer2 < str2.Length)
        {
            char incrementedChar = (char)((str1[pointer1] - 'a' + 1) % 26 + 'a');
            if (str1[pointer1] == str2[pointer2] || incrementedChar == str2[pointer2])
            {
                pointer2++;
            }
            pointer1++;
        }
        return pointer2 == str2.Length;
    }
}