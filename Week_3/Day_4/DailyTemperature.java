class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] ans = new int[t.length];
        Stack<Integer> stack = new Stack<>();
        
        
        for (int i = t.length - 1; i >= 0; i--) 
        {
            while (!stack.isEmpty() && t[stack.peek()] <= t[i]) 
            {
                stack.pop();
            }

            ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        
        return ans;
    }
}