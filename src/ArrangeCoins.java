public class ArrangeCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }
    public static int arrangeCoins(int n) {
        if (n == 0) {
            return 0;
        }
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = (int) (left + (right - left) / 2);
            double sum = ((1 + mid) * (mid / 2.0));
            if (sum == n || (sum < n && sum + mid + 1 > n)) {
                return mid;
            } else if (sum > n) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
