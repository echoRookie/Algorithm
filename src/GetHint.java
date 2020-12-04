public class GetHint {
    public static void main(String[] args) {

        System.out.println(getHint("1807", "7810"));
        System.out.println(getHint("1123", "0111"));
    }

    public static String getHint(String secret, String guess) {
        int bullsCount = 0;
        int[] numsSecret = new int[10];
        int[] numsGuess = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            ++numsSecret[secret.charAt(i) - '0'];
            ++numsGuess[guess.charAt(i) - '0'];
            if (secret.charAt(i) == guess.charAt(i)) {
                ++bullsCount;
            }
        }
        int cowsCount = 0;
        for (int i = 0; i < numsGuess.length; i++) {
            if (numsSecret[i] == 0) {
                continue;
            } else {
                cowsCount = cowsCount + Math.min(numsSecret[i], numsGuess[i]);
            }
        }
        return bullsCount + "A" + (cowsCount - bullsCount) + "B";
    }
}
