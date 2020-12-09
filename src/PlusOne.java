import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int[] temp = new int[digits.length + 1];
        for (int i = 1; i < temp.length; i++) {
            temp[i] = digits[i - 1];
        }
        digits[digits.length - 1]++;
        plus(digits.length - 1, temp);
        if (temp[0] != 0) {
            return temp;
        } else {
            return Arrays.copyOfRange(temp, 1, temp.length);
        }

    }

    public static void plus(int index, int[] digits) {
        if (digits[index] < 10) {
            return;
        }
        int a = digits[index] / 10;
        int b = digits[index] % 10;
        digits[index] = b;
        digits[index - 1] += a;
        plus(index - 1, digits);
    }
}
