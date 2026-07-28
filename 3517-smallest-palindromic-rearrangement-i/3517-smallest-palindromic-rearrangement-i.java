class Solution {
    public String smallestPalindrome(String str) {
        int len = str.length();
        int half = len / 2;

        char[] firstHalf = str.substring(0, half).toCharArray();
        Arrays.sort(firstHalf);

        char[] result = new char[len];
        
        for (int i = 0; i < half; i++) {
            result[i] = firstHalf[i];
        }

        if (len % 2 == 1) {
            result[half] = str.charAt(half);
        }
        for (int i = 0; i < half; i++) {
            result[len - 1 - i] = firstHalf[i];
        }

        return new String(result);
    }
}