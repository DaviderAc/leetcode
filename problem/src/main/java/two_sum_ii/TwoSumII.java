package two_sum_ii;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 * <p>
 * Note:
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * <p>
 * Example:
 * Input: numbers = [2,7,11,15],target = 9
 * Output: [1,2]
 */
public class TwoSumII {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoSumII().twoSum(new int[]{2, 7, 11, 15}, 9)));
    }


    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                int index = map.get(target - numbers[i]);
                if (i < index) {
                    return new int[]{i + 1, index + 1};
                } else {
                    return new int[]{index + 1, i + 1};
                }
            }
            map.put(numbers[i], i);
        }
        return null;
    }

}
