public class JudgeSquareSum {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(2147483646));
        System.out.println(judgeSquareSum(2147483646));
    }

    public static boolean judgeSquareSum(int c) {
        for (int i = 0; i <= Math.sqrt(c); i++) {
            double b = Math.sqrt(c - i * i);
            if (b == (int) b) {
                return true;
            }
        }
        return false;
    }
}
