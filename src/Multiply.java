public class Multiply {
    public static void main(String[] args) {
        System.out.println(multiply("123", "24"));
    }
    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int length1 = num1.length();
        int length2 = num2.length();
        String res = "0";
        for (int i = length1-1; i>=0; i--){
            long carry = 0;
            StringBuffer stringBuffer = new StringBuffer();
            for(int n = length1 -1; n > i; n--){
                stringBuffer.append(0);
            }
            for (int j = length2 -1; j>=0; j--){
                long sum = (num1.charAt(i)-'0') * (num2.charAt(j)-'0') + carry;
                stringBuffer.append(sum%10);
                carry =sum/10;
            }
            if (carry != 0){
                stringBuffer.append(carry %10);
            }

            res = addString(res, stringBuffer.reverse().toString());
        }
        return  res;
    }

    public static String addString (String a, String b){
        int length1 = a.length() -1;
        int length2 = b.length()-1;
        int carry = 0;
        StringBuffer stringBuffer = new StringBuffer();
        while (length1 >= 0 || length2 >= 0 || carry!=0){
            int x = length1 < 0 ? 0 : a.charAt(length1) - '0';
            int y = length2 < 0 ? 0 : b.charAt(length2) - '0';
            int sum = x + y + carry;
            stringBuffer.append(sum %10);
            carry = sum/10;
            length1--;
            length2--;
        }
        return  stringBuffer.reverse().toString();
    }
}
