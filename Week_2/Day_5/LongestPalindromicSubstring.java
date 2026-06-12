class Solution {
    boolean isPalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(j)!=s.charAt(i))
            return false;
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        String ans=s.substring(0,1);
        int size=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+2;j<=s.length();j++)
            {
                if(isPalindrome(s.substring(i,j)) && ans.length()<(j-i))
                ans=s.substring(i,j);
            }
        }
        return ans;
    }
}
