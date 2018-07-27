// 4. Median of Two Sorted Arrays

import java.util.Arrays;

class Q4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;

        return totalLength % 2 == 0 ? (findKthSmallestNumber(nums1, nums2, totalLength/2) + findKthSmallestNumber(nums1, nums2, totalLength/2 + 1))/2d
                                    : findKthSmallestNumber(nums1, nums2, totalLength/2 + 1);
    }

    // Here we implicitly assume arr1.length <= arr2.length.
    private int findKthSmallestNumber(int[] arr1, int[] arr2, int k) {
        if (arr1.length > arr2.length) {
            return findKthSmallestNumber(arr2, arr1, k);
        }

        if (arr1.length == 0) {
            return arr2[k-1];
        }

        if (k == 1) {
            return Math.min(arr1[0], arr2[0]);
        }

        int arr1_BreakPoint = Math.min(arr1.length, k/2) - 1;
        int arr2_BreakPoint = k/2 - 1;

        if (arr1[arr1_BreakPoint] < arr2[arr2_BreakPoint]) {
            return findKthSmallestNumber(Arrays.copyOfRange(arr1, arr1_BreakPoint+1, arr1.length), arr2, k - arr1_BreakPoint - 1);
        } else {
            return findKthSmallestNumber(arr1, Arrays.copyOfRange(arr2, arr2_BreakPoint+1, arr2.length), k - arr2_BreakPoint - 1);
        }
    }
}
