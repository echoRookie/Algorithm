public class LicenseKeyFormatting {
    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("2-5g-3-J", 2));
    }
    public static String licenseKeyFormatting(String S, int K) {
        S = S.toUpperCase();
        String[] strings = S.split("-");
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : strings) {
            stringBuffer.append(str);
        }
        StringBuffer res = new StringBuffer();
        int index = stringBuffer.length();
        while (index > 0) {
            if (index <= K) {
                res.insert(0, stringBuffer.subSequence(0, index));
            } else {
                res.insert(0, stringBuffer.subSequence(index - K, index)).insert(0, "-");
            }
            index -= K;
        }
        return res.toString();
    }
}
