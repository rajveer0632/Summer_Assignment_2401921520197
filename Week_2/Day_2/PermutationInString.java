class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        if (n < m) 
        {
            return false;
        }
        int[] pf = new int[26];
        for (int i = 0; i < m; i++) 
        {
            pf[s1.charAt(i) - 'a']++;
        }
        int[] freq = new int[26];
        for (int i = 0; i < m; i++) 
        {
            freq[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(pf, freq)) 
        {
            return true;
        }
        for (int i = m; i < n; i++) 
        {
            freq[s2.charAt(i) - 'a']++;
            freq[s2.charAt(i - m) - 'a']--;
            if (Arrays.equals(pf, freq)) 
            {
                return true;
            }
        }
        
        return false;
    }
}