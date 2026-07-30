class Solution {
    public int maxLength(int[] nums) {
        int maxLen=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            long prod=1;
            long gcd=nums[i];
            long lcm=nums[i];
            for(int j=i;j<n;j++){ 
                if (j > i) {
                    gcd = gcd(gcd, nums[j]);
                    lcm = lcm(lcm, nums[j]);
                }
                prod *= nums[j];
                // else{
                //     gcd= gcd(gcd,nums[j]);
                //     lcm = lcm(lcm,nums[j]);
                // }
                if(prod == gcd * lcm){
                    maxLen = Math.max(maxLen, j-i+1);
                }
            }
        }
         return maxLen;
    }
    private long gcd(long a, long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a= temp;
        }
        return a;
    }
    private long lcm(long a, long b){
        return(a/gcd(a,b)*b);
    }
}