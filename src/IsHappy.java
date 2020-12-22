import java.util.HashSet;
import java.util.Set;

public class IsHappy {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        System.out.println(isHappy(20));
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        return isHappy1(n, set);
    }

    public static boolean isHappy1(int n, Set<Integer> set) {
        if (n == 1) {
            return true;
        }
        if (set.contains(n)) {
            return false;
        }
        set.add(n);
        int sum = 0;
        int carry = 0;
        while (n > 0) {
            carry = n % 10;
            n = n / 10;
            sum += carry * carry;
        }
        return isHappy1(sum, set);
    }
}
