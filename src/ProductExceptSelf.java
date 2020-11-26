public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] res = productExceptSelf1(new int[]{0, 0});
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] productExceptSelf(int[] nums) {
       int[] preOrder = new int[nums.length];
        int[] postOrder = new int[nums.length];
        preOrder[0] =1;
        postOrder[nums.length -1] = 1;
        for (int i = 1; i< nums.length; i++){
            preOrder[i] = preOrder[i -1] * nums[i -1];
            postOrder[nums.length -i-1] = postOrder[nums.length - i] * nums[nums.length - i];
        }
        int[] res = new int[nums.length];
        for (int i = 0; i< nums.length;i++){
            res[i] = preOrder[i] * postOrder[i];
        }
        return res;
    }

    public static int[] productExceptSelf1(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] * nums[i - 1];

        }
        int temp = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] = res[i] * temp;
            temp = temp * nums[i];
        }
        return res;
    }
}
