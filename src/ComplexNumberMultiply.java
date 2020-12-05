public class ComplexNumberMultiply {
    public static void main(String[] args) {
        System.out.println(complexNumberMultiply("1+-1i", "1+-1i"));
    }
    public static String complexNumberMultiply(String a, String b) {
        //分割字符串
        String[] aStr = a.split("\\+");
        String[] bStr = b.split("\\+");
        int a1 = Integer.valueOf(aStr[0]);
        String temp = aStr[1].substring(0, aStr[1].length());
        int a2 = Integer.valueOf(aStr[1].substring(0, aStr[1].length() - 1));
        int b1 = Integer.valueOf(bStr[0]);
        int b2 = Integer.valueOf(bStr[1].substring(0, bStr[1].length() - 1));
        //
        int res1 = a1 * b1 + a2 * b2 * -1;
        int res2 = a1 * b2 + a2 * b1;
        return res1 + "+" + res2 + "i";
    }
}
