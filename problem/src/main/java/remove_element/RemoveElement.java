package remove_element;

/**
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class RemoveElement {

    public static void main(String[] args) {
        System.out.println(RemoveElement.removeElement(new int[]{3, 2, 2, 3, 2}, 3));
    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int length = nums.length;

        int i = 0;
        for (int j = 0; j < length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
