class Solution {
    public int diagonalSum(int[][] mat) {
        int i=mat.length;
        int ans=0;
        for (int j=0;j<i;j++)
        {
                ans+=mat[j][j];
                ans+=mat[j][i-j-1];
        }
        if(i%2!=0)
        {
            ans-=mat[i/2][i/2];
        }
        return ans;
    }
}