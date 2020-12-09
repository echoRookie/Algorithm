public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1111", "1111"));
    }
    public static String addBinary(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        int maxLength = Math.max(aLength, bLength);
        int minLength = Math.min(aLength, bLength);
        int[] nums = new int[maxLength];
        for (int i = 0; i < minLength; i++) {
            int temp = Integer.valueOf(a.charAt(aLength - 1 - i) - '0') + Integer.valueOf(b.charAt(bLength - 1 - i) - '0');
            nums[i] = temp;
        }
        for (int i = 0; i < maxLength - minLength; i++) {
            if (aLength > bLength) {
                nums[i + minLength] = Integer.valueOf(a.charAt(aLength - minLength - 1 - i) - '0');
            } else {
                nums[i + minLength] = Integer.valueOf(b.charAt(bLength - minLength - 1 - i) - '0');
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= 2) {
                stringBuffer.append(nums[i] % 2);
                nums[i + 1] += nums[i] / 2;
            } else {
                stringBuffer.append(nums[i]);
            }
        }
        if (nums[maxLength - 1] >= 2) {
            stringBuffer.append(nums[maxLength - 1] % 2).append(nums[maxLength - 1] / 2);
        } else {
            stringBuffer.append(nums[maxLength - 1]);
        }
        return stringBuffer.reverse().toString();
    }
}
