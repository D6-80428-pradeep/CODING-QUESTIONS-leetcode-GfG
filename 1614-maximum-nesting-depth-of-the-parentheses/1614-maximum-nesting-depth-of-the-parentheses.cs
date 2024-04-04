public class Solution {
    public int MaxDepth(string s) {
        
    if (s.Length == 0) return 0;
    Stack<char> stack = new Stack<char>();
    int max = 0;
    for (int i = 0; i < s.Length; i++) {
        if (s[i] == '(') {
            stack.Push('(');
            max = Math.Max(max, stack.Count);
        }
        if (s[i] == ')') {
            stack.Pop();
        }
    }
    return max;
        
    }
}


