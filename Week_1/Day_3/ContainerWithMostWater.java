class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j= height.length-1;
        int max=0;
        int current=0;
        while(i<j)
        {
            if(height[i]>height[j])
            {
                current=height[j]*(j-i);
                j--;
            }
            else
            {
                current=height[i]*(j-i);
                i++;
            }
            max=Math.max(max,current);
        }
        return max;
    }
}