class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int n = s.length();
        int m = p.length();
        if (n < m) {
            return result;
        }
        int[] pf = new int[26];
        for (int i = 0; i < m; i++) {
            pf[p.charAt(i) - 'a']++;
        }
        int[] freq = new int[26];
        for (int i = 0; i < m - 1; i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = m - 1; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
            if (Arrays.equals(pf, freq)) {
                result.add(i - m + 1);
            }
            freq[s.charAt(i - m + 1) - 'a']--;
        }
        
        return result;
    }
}