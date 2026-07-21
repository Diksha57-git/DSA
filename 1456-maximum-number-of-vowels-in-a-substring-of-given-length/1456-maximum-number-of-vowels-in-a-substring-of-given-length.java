class Solution {
    public int maxVowels(String s, int k) {
        char[] v= {'a','e','i','o','u'};
        int count=0;
        for(int i=0;i<k;i++){
            if(new String(v).indexOf(s.charAt(i)) != -1){
                count++;
            }
        }
        int max_count = count;
        for(int i=k;i<s.length();i++){
            if(new String(v).indexOf(s.charAt(i)) != -1){
                count++;
            }
            if(new String(v).indexOf(s.charAt(i-k)) != -1){
                count--;
            }
            max_count = Math.max(max_count,count);
        }
        return max_count;
    }
}