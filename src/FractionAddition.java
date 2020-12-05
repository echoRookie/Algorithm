public class FractionAddition {
    public static void main(String[] args) {
        System.out.println(fractionAddition("-1/2+1/2+1/3"));
    }
    public static String fractionAddition(String expression) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '-') {
                stringBuffer.append("+");
                stringBuffer.append("-");
            } else {
                stringBuffer.append(expression.charAt(i));
            }
        }
        // 分割字符串
        String[] strings = stringBuffer.toString().split("\\+|/");
        int index = 0;
        if (strings[index].equals("")) {
            ++index;
        }
        int sumA = 0, sumB = 1;
        for (int i = index; i < strings.length - 1; i += 2) {
            // 分子
            int a = Integer.valueOf(strings[i]);
            // 分母
            int b = Integer.valueOf(strings[i + 1]);
            // 最小公倍数
            int num = searchMin(sumB, b);
            // 计算分子
            sumA = sumA * (num / sumB) + a * (num / b);
            sumB = num;
        }
        int max = searchMax(Math.abs(sumA), Math.abs(sumB));
        sumA = sumA / max;
        sumB = sumB / max;
        return String.valueOf(sumA) + "/" + String.valueOf(sumB);
    }

    // 查找最小公倍数
    public static int searchMin(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (max % min == 0) {
            return max;
        }
        int index = max;
        while (!(index % min == 0 && index % max == 0)) {
            ++index;
        }
        return index;
    }

    //查找最大公约数
    public static int searchMax(int a, int b) {
        if (a == 0 || b == 0) {
            return Math.max(a, b);
        }
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (max % min == 0) {
            return min;
        }
        return searchMax(min, max % min);
    }
}
