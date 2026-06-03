class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int[] ans=new int[nums.length];
        for(int n=nums.length-1;n>=0;n--)
        {
            if(Math.abs(nums[i])>Math.abs(nums[j]))
            {
                ans[n]=(int)Math.pow(nums[i],2);
                i++;
            }
            else
            {
                ans[n]=(int)Math.pow(nums[j],2);
                j--;
            }
        }
        return ans;
    }
}