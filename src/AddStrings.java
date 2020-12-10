public class AddStrings {
    public static String addStrings(String num1, String num2) {
        int aLength = num1.length();
        int bLength = num2.length();
        int maxLength = Math.max(aLength, bLength);
        int minLength = Math.min(aLength, bLength);
        int[] nums = new int[maxLength];
        for (int i = 0; i < minLength; i++) {
            int temp = Integer.valueOf(num1.charAt(aLength - 1 - i) - '0') + Integer.valueOf(num2.charAt(bLength - 1 - i) - '0');
            nums[i] = temp;
        }
        for (int i = 0; i < maxLength - minLength; i++) {
            if (aLength > bLength) {
                nums[i + minLength] = Integer.valueOf(num1.charAt(aLength - minLength - 1 - i) - '0');
            } else {
                nums[i + minLength] = Integer.valueOf(num2.charAt(bLength - minLength - 1 - i) - '0');
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= 10) {
                stringBuffer.append(nums[i] % 10);
                nums[i + 1] += nums[i] / 10;
            } else {
                stringBuffer.append(nums[i]);
            }
        }
        if (nums[maxLength - 1] >= 10) {
            stringBuffer.append(nums[maxLength - 1] % 10).append(nums[maxLength - 1] / 10);
        } else {
            stringBuffer.append(nums[maxLength - 1]);
        }
        return stringBuffer.reverse().toString();
    }
}

