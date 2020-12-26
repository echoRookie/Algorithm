public class FindMaxAverage {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        if (nums == null || nums.length < k) {
            return 0;
        }
        double sum = 0;
        double average = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        average = sum / k;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - k];
            double temp = sum / k;
            if (temp > average) {
                average = temp;
            }
        }
        return average;
    }
}
