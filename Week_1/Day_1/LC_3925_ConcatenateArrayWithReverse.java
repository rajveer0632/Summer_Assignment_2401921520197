class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n= nums.length;
        int ans[]= new int[2*n];
        for(int k=0;k<n;k++)
        {
            ans[k]=nums[k];
            ans[2*n-k-1]=nums[k];
        }
        return ans;
    }
}
