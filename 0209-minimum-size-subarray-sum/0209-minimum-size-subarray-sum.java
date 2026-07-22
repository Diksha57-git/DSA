class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j=0;
        int sum=0;
        int min_length = Integer.MAX_VALUE; 
        int i=0;

        while(j<nums.length){
            sum+=nums[j];
            while(sum>=target){
                sum -=nums[i];
                int current_length = j-i+1;
                min_length = Math.min(current_length,min_length);
                i++;
            }
            j++;
        }
        if(min_length==Integer.MAX_VALUE){
            return 0;
        }
        return min_length;
    }
}