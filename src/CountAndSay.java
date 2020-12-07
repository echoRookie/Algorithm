public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }

    public static String countAndSay(int n) {
        if (n == 1) {
            return String.valueOf(1);
        }
        if (n == 2) {
            return String.valueOf(11);
        }
        String res = "11";
        for (int i = 3; i <= n; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            int count = 0;
            for (int j = 1; j < res.length(); j++) {
                if (res.charAt(j) != res.charAt(j - 1)) {
                    stringBuffer.append(++count);
                    stringBuffer.append(res.charAt(j - 1));
                    count = 0;
                } else {
                    ++count;
                }
            }
            if (res.charAt(res.length() - 1) == res.charAt(res.length() - 2)) {
                stringBuffer.append(++count);
                stringBuffer.append(res.charAt(res.length() - 1));
            } else {
                stringBuffer.append(1);
                stringBuffer.append(res.charAt(res.length() - 1));
            }
            res = stringBuffer.toString();

        }
        return res;
    }
}
