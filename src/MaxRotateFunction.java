public class MaxRotateFunction {
    public static void main(String[] args) {
        System.out.println(maxRotateFunction(new int[]{4, 3, 2, 6}));
    }

    public static int maxRotateFunction(int[] A) {
        int max = 0;
        // 计算F(0),设为当前最大值
        for (int i = 1; i < A.length; i++) {
            max += i * A[i];
        }
        for (int i = 0; i < A.length - 1; i++) {
            // 旋转数组
            int temp = A[A.length - 1];
            for (int j = 0; j < A.length; j++) {
                int next = A[j];
                A[j] = temp;
                temp = next;
            }
            // 计算当前F（N）的值
            int fn = 0;
            for (int k = 1; k < A.length; k++) {
                fn += k * A[k];
            }
            if (fn > max) {
                max = fn;
            }
        }
        return max;
    }
}
