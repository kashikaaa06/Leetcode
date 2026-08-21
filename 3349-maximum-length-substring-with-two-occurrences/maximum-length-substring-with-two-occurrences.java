class Solution {
    public int maximumLengthSubstring(String s) {
        int[] count = new int[26];
        int left = 0;
        int maxLen = 0;
        
        for (int right = 0; right < s.length(); right++) {
            int rightIdx = s.charAt(right) - 'a';
            count[rightIdx]++;
            
            // Shrink window if character count exceeds 2
            while (count[rightIdx] > 2) {
                int leftIdx = s.charAt(left) - 'a';
                count[leftIdx]--;
                left++;
            }
            
            // Calculate max window size
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
}
