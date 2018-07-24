// 11. Container With Most Water

import static java.lang.Math.max;
import static java.lang.Math.min;

class Q11 {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length - 1;

        while (i < j) {
            maxArea = max(maxArea, min(height[i], height[j]) * (j-i));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxArea;
    }
}
