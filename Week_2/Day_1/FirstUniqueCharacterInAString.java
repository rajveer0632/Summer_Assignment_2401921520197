class Solution {
    public int firstUniqChar(String s) {
        char[] c = s.toCharArray();
        int[] count = new int[26];
        for(char ch:c)
        {
            count[ch-'a']++;
        }
        for(char ch:c)
        {
            if(count[ch-'a']==1)
            {
                return s.indexOf(ch);
            }
        }

        return -1;
    }
}