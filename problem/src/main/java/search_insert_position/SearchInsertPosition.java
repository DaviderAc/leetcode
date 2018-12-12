package search_insert_position;

/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * <p>
 * You may assume no duplicates in the array.
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        System.out.println(SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 7, 9}, 8));
    }

    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length;

        int mid = 0;
        while (low < high) {
            mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

}
