class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0;
        int left = 0;
        int[] ind = new int[128];
        for (int i = 0; i < 128; i++) {
            ind[i] = -1;
        }
        
        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);

            if (ind[ch] >= left) {
                left = ind[ch] + 1;
            }
            ind[ch] = right;
            max = Math.max(max, right - left + 1);
        }
        
        return max;
    }
}