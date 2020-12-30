public class MySqrt {
    public int mySqrt(int x) {
        long left = 0;
        long right = x;
        while (left < right) {
            long mid = left + (right - left) / 2;
            if (mid * mid == x || (mid * mid < x && (mid + 1) * (mid + 1) > x)) {
                return (int) mid;
            } else if (mid * mid > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return (int) left;
    }
}
