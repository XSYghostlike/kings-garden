// 15. 3Sum

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Q15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);
        int i,head,tail,temp;
        for (i=0;i<nums.length-2;i++) {
            temp = 0 - nums[i];
            head = i+1;
            tail = nums.length-1;
            while (head < tail) {
                if (nums[head] + nums[tail] == temp) {
                    results.add(Arrays.asList(nums[i], nums[head], nums[tail]));
                    while (head < nums.length-1 && nums[head] == nums[head+1]) head++;
                    head++;
                    while (tail > 0 && nums[tail] == nums[tail-1]) tail--;
                    tail--;
                } else if (nums[head] + nums[tail] > temp) {
                    tail--;
                } else {
                    head++;
                }
            }
            while (i < nums.length-1 && nums[i] == nums[i+1]) i++;
        }

        return results;
    }
}
