import java.util.ArrayList;
import java.util.List;

public class Generate {
    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<>();
        res = generate(5);
        for (List<Integer> list : res) {
            String s = "";
            for (Integer num : list) {
                s = s + num + " ";
            }
            System.out.println(s);
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 1) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            res.add(new ArrayList<>(list));
        }
        if (numRows == 2) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            res.add(new ArrayList<>(list));
            list = new ArrayList<>();
            list.add(1);
            list.add(1);
            res.add(new ArrayList<>(list));
        }
        if (numRows > 2) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            res.add(new ArrayList<>(list));
            list = new ArrayList<>();
            list.add(1);
            list.add(1);
            res.add(new ArrayList<>(list));
            for (int i = 3; i <= numRows; i++) {
                List<Integer> valueList = new ArrayList<>(res.get(i - 2));
                list = new ArrayList<>();
                for (int j = 0; j < i; j++) {
                    if (j == 0 || j == i - 1) {
                        list.add(1);
                    } else {

                        list.add(valueList.get(j) + valueList.get(j - 1));
                    }
                }
                res.add(new ArrayList<>(list));
            }
        }
        return res;
    }
}
