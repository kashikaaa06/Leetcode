import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        // Map each Roman numeral character to its integer value
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        
        int total = 0;
        int length = s.length();
        
        for (int i = 0; i < length; i++) {
            int currentVal = roman.get(s.charAt(i));
            
            // Check if a larger numeral follows the current one
            if (i + 1 < length && currentVal < roman.get(s.charAt(i + 1))) {
                total -= currentVal;
            } else {
                total += currentVal;
            }
        }
        
        return total;
    }
}
