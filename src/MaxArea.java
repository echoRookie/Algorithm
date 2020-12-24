public class MaxArea {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    public static int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int temp = (j - i) * Math.min(height[i], height[j]);
                if (temp > max) {
                    max = temp;
                }
            }
        }
        return max;
    }
}
