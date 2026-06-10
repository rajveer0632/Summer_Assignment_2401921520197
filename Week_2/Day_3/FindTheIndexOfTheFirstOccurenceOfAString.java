class Solution {
    public int strStr(String haystack, String needle) {
        int ans=-1;
        int n=needle.length();
        for(int i=0;i<=haystack.length()-n;i++)
        {
            int k=0;
            for(int j=i;j<i+n;j++)
            {
                if(needle.charAt(k)!=haystack.charAt(j))
                {
                    break;
                }
                k++;
            }
            if(k==n)
            {
                ans=i;
                break;
            }
        }

        return ans;
    }
}