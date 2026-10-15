class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0, right = n-1;
        int MaxWater = 0;
        while(left<right){
            int w = right - left;
            int h = Math.min(height[left],height[right]);
            int Area = w*h;
            MaxWater = Math.max(MaxWater,Area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return MaxWater;
    }
}