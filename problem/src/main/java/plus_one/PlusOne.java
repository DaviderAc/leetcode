package plus_one;

import java.util.Arrays;

/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 * <p>
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * <p>
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 */
public class PlusOne {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new PlusOne().plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(new PlusOne().plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})));
        System.out.println(Arrays.toString(new PlusOne().plusOne(new int[]{9, 9})));
    }

    public int[] plusOne(int[] digits) {
        int length = digits.length;

        int n = length - 1;
        int carry = 1;
        do {
            carry = (digits[n] + 1) / 10;
            digits[n] = (digits[n] + 1) % 10;
            n--;
        } while (n >= 0 && carry == 1);

        if (carry == 1) {
            int[] result = new int[length + 1];
            for (int i = 0; i <= length; i++) {
                if (i == 0) {
                    result[i] = 1;
                } else {
                    result[i] = 0;
                }

            }
            return result;
        }

        return digits;
    }

}
