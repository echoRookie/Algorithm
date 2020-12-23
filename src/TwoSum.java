public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int rigth = numbers.length - 1;
        while (left < rigth) {
            if (numbers[left] + numbers[rigth] == target) {
                return new int[]{left + 1, rigth + 1};
            } else if (numbers[left] + numbers[rigth] > target) {
                rigth--;
            } else {
                left++;
            }
        }
        return new int[]{left + 1, rigth + 1};
    }
}
