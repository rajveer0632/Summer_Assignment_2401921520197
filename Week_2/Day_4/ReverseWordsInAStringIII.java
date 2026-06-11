class Solution {
    void reverse(char[] ch,int i,int j)
    {
        while(i<j)
        {
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
    }
    public String reverseWords(String s) {
        char[] ch= s.toCharArray();
        int i=0;
        while(i<ch.length)
        {
            int j=i;
            while(j<ch.length && ch[j]!=' ')
            {
                j++;
            }
            reverse(ch,i,j-1);
            j++;
            i=j;

        }
        return new String(ch);
    }
}