// 1. Two Sum

import java.util.HashMap;
import java.util.Map;

class Q1 {
    public int[] twoSum(int[] nums, int target) {
        Map map = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for (int i = 0;i < nums.length; i++) {
            int expect = target - nums[i];
            if (map.containsKey(expect)) {
                result[0] = (int)map.get(expect);
                result[1] = i;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}