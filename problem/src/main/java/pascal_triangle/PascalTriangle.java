package pascal_triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 * <p>
 * Input: 5
 * Output:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
public class PascalTriangle {

    public static void main(String[] args) {
        System.out.println(new PascalTriangle().generate(5));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        result.add(list);
        if (numRows == 1) {
            return result;
        }

        for (int i = 2; i <= numRows; i++) {
            // 获取前一个索引的结果
            List<Integer> formerList = result.get(i - 2);

            List<Integer> _list = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                int a = (j == 0 || j == i - 1) ? (j == 0 ? formerList.get(0) : formerList.get(j - 1)) : formerList.get(j - 1) + formerList.get(j);
                _list.add(a);
            }
            result.add(_list);
        }
        return result;
    }

}
