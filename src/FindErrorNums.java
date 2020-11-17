public class FindErrorNums {
    public int[] findErrorNums(int[] nums) {
        int[] numsCopy = new int[nums.length];
        int repeatNum = 0;
        int loseNum = 0;
        for (int num : nums) {
            if (numsCopy[num - 1] != 0) {
                repeatNum = num;
                continue;
            } else {
                numsCopy[num - 1] = num;
            }
        }
        for (int i = 0; i < numsCopy.length; i++) {
            if (numsCopy[i] == 0) {
                loseNum = i + 1;
            }
        }
        return new int[]{repeatNum, loseNum};
    }
}
