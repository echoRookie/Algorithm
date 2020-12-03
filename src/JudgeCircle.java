public class JudgeCircle {
    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
    }
    public static boolean judgeCircle(String moves) {
        int[] nums = new int[4];
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L') {
                ++nums[0];
            } else if (moves.charAt(i) == 'R') {
                ++nums[1];
            } else if (moves.charAt(i) == 'U') {
                ++nums[2];
            } else {
                ++nums[3];
            }
        }
        if (nums[0] != nums[1] || nums[2] != nums[3]) {
            return false;
        }
        return true;
    }
}
