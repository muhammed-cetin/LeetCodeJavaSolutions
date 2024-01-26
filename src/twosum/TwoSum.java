package twosum;

import java.util.Arrays;

public class TwoSum {
    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] numArray = {11, 15, 2, 7};
        int sumTarget = 9;
        System.out.println(Arrays.toString(twoSum(numArray, sumTarget)));
    }
}
