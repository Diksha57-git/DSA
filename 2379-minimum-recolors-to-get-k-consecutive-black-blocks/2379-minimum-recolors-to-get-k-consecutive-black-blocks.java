class Solution {
    public int minimumRecolors(String blocks, int k) {
        int wcount=0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                wcount++;
            }
        }
        min = wcount;
        for(int i = 0; i < blocks.length() - k; i++){
            if(blocks.charAt(i) == 'W'){
                wcount--;
            }

            if(blocks.charAt(i + k) == 'W'){
                wcount++;
            }
            min = Math.min(min , wcount);
        }
        return min;
    }
}