public class AddStrings {
    public static void main(String[] args) {
        System.out.println(addStrings1("6", "501"));
    }
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
    public static String addStrings1(String num1, String num2) {
        int length1 = num1.length() -1;
        int length2 = num2.length()-1;
        int carry = 0;
        StringBuffer stringBuffer = new StringBuffer();
        while (length1 >= 0 || length2 >= 0 || carry!=0){
            int x = length1 < 0 ? 0 : num1.charAt(length1) - '0';
            int y = length2 < 0 ? 0 : num2.charAt(length2) - '0';
            int sum = x + y + carry;
            stringBuffer.append(sum %10);
            carry = sum/10;
            length1--;
            length2--;
        }
        return  stringBuffer.reverse().toString();
    }
}

