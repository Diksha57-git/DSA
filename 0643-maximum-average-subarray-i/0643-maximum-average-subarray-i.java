class Solution {
    public double findMaxAverage(int[] nums, int k) {
      int i,sum=0,maxsum;
      for(i=0;i<k;i++){
        sum +=nums[i];
      }
      maxsum=sum;
      for(i=k;i<nums.length;i++){
        sum+=nums[i]-nums[i-k];
        maxsum= Math.max(maxsum,sum);
      }
      return (double)maxsum/k;
    } 
}