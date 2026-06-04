class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c)
        {
            return mat;
        }
        else
        {
            int[][] ans=new int[r][c];
            int t=0;
            int s=0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    ans[t][s]=mat[i][j];
                    s++;
                    if(s==c)
                    {
                        s=0;
                        t++;
                    }
                }
            }
            return ans;
        }
    }
}