class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
       
        int i=0;
        while(i<k)
            {
                sum+=nums[i];
                i++;
            }
        double max=sum;
        for (i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }
        
        return max/ k;
    }
}