public class CoinProblemBasicTest {

    private int[] d; // 储存结果
    private int[] coins = {1, 3, 5}; // 硬币种类

    private void d_func(int i, int num) {
        if (i == 0) {
            d[i] = 0;
            d_func(i + 1, num);
        }
        else {
            int min = 9999999; // 初始化一个很大的数值。当最后如果得出的结果是这个数时，说明凑不出来。
            for (int coin : coins) {
                if (i >= coin && d[i - coin] + 1 < min) {
                    min = d[i - coin] + 1;
                }
            }
            d[i] = min;

            if (i < num) {
                d_func(i + 1, num);
            }
        }
    }


    @Test
    public void test() throws Exception {
        int sum = 11; // 需要凑 11 元
        d = new int[sum + 1]; // 初始化数组

        d_func(0, sum); // 计算需要凑出 0 ～ sum 元需要的硬币数量
        for (int i = 0; i <= sum; i++) {
            System.out.println("凑齐 " + i + " 元需要 " + d[i] + " 个硬币");
        }
    }
}