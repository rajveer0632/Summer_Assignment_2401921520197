class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        if(n==1) return 1;
        int i=0;
        int j=0;
        int k=0;
        while(i<n)
        {   int count=0;
            while(j<n && chars[j]==chars[i])
            {
                j++;
            }
            chars[k]=chars[i];
            k++;
            count=j-i;
            String s= String.valueOf(count);
            if(count>1){
            for(int m=0;m<s.length();m++)
            {
                chars[k]=s.charAt(m);
                k++;
            }
            }
            i=j;
        }
        return k;
    }
}