package pascal_triangle_ii;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 * Note that the row index starts from 0.
 * <p>
 * Input: 3
 * Output: [1,3,3,1]
 */
public class PascalTriangleII {

    public static void main(String[] args) {
        System.out.println(new PascalTriangleII().getRow(3));
    }

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        result.add(list);

        if (rowIndex == 0) {
            return result.get(0);
        }

        for (int i = 1; i <= rowIndex; i++) {

            List<Integer> formerList = result.get(i - 1);

            List<Integer> _list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                int a = (j == 0 || j == i) ? (j == 0 ? formerList.get(0) : formerList.get(j - 1)) : formerList.get(j - 1) + formerList.get(j);
                _list.add(a);
            }
            if (i == rowIndex) {
                return _list;
            }
            result.add(_list);
        }
        return null;
    }

}
