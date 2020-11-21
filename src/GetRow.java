import java.util.ArrayList;
import java.util.List;

public class GetRow {
    public static void main(String[] args) {
        List<Integer> res = getRow(4);
        for (Integer num : res) {
            System.out.println(num);
        }
    }
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        if (rowIndex == 0) {
            res.add(1);
        }
        if (rowIndex > 0) {
            res.add(1);
            res.add(1);
            for (int i = 2; i <= rowIndex; i++) {
                res.add(1);
                for (int j = i - 1; j > 0; j--) {
                    res.set(j, res.get(j) + res.get(j - 1));
                }
            }
        }
        return res;
    }
}
