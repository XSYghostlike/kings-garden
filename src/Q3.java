// 3. Longest Substring Without Repeating Characters

import java.util.HashSet;
import java.util.Set;

import static java.lang.Math.max;

class Q3 {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int headIndex = 0;
        int tailIndex = 0;
        Set<Character> windowSet= new HashSet<>();

        while (tailIndex <= s.length()-1) {
            if (windowSet.add(s.charAt(tailIndex))) {
                tailIndex++;
                maxLen = max(maxLen, tailIndex - headIndex);
            } else {
                windowSet.remove(s.charAt(headIndex));
                headIndex++;
            }
        }

        return maxLen;
    }
}
