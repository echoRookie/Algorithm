public class DetectCapitalUse {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("FLaG"));
    }

    public static boolean detectCapitalUse(String word) {
        int length = word.length();
        //设立标记
        int big = 0;
        for (int i = 0; i < length; i++) {
            if (word.charAt(i) >= 65 && word.charAt(i) <= 90) {
                big++;
            }
        }
        if (big == length) {
            return true;
        } else if (big == 0) {
            return true;
        } else if (big == 1 && length > 1 && word.charAt(0) >= 65 && word.charAt(0) <= 90) {
            return true;
        } else {
            return false;
        }
    }
}
