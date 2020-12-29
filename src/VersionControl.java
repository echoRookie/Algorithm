public class VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            if (left == 1 && right == 1) {
                return 1;
            }
            int mid = left + (right - left) / 2;
            if (!isBadVersion(mid) && isBadVersion(mid + 1)) {
                return mid + 1;
            } else if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return left;
    }
    public int firstBadVersion1(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (!isBadVersion(mid)) {
                left = mid +1;
            }  else {
                right = mid;
            }
        }
        return left;

    }
    public boolean isBadVersion(int version) {
        return true;
    }
}
