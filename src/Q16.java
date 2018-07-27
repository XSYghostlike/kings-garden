// 16. 3Sum Closest

import java.util.Arrays;

class Q16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int i,head,tail,temp;
        int currentResult = 0;
        int currDiff = Integer.MAX_VALUE;
        for (i=0;i<nums.length-2;i++) {
            temp = target - nums[i];
            head = i+1;
            tail = nums.length-1;
            while (head < tail) {
                if (currDiff > Math.abs(nums[head] + nums[tail] - temp)) {
                    currDiff = Math.abs(nums[head] + nums[tail] - temp);
                    currentResult = nums[head] + nums[tail] + nums[i];
                }

                if (nums[head] + nums[tail] == temp) {
                    tail--;
                    head++;
                } else if (nums[head] + nums[tail] > temp) {
                    tail--;
                } else {
                    head++;
                }
            }
            while (i < nums.length-1 && nums[i] == nums[i+1]) i++;
        }

        return currentResult;
    }
}
