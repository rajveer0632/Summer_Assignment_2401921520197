class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
        return true;
        int comp=0;
        int m=0,n=0;
        while(m<s.length() && n<t.length())
        {
            if(s.charAt(m)==t.charAt(n))
            {
                m++;
                comp++;
            }
            n++;
            if(comp==s.length())
            {
                return true;
            }
        }
        return false;
    }
}