import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) {
        System.out.println(hIndex(new int[]{1}));
    }
    public static int hIndex(int[] citations) {
        // 数组先排序
        Arrays.sort(citations);
        int hindex = 0;
        //长度不会超过给定数组的长度
        for(int i = 1; i <= citations.length; i++){
            // 寻找大于给定长度的索引
            for(int j = 0; j < citations.length; j++){
                if(citations[j] >= i){
                    // 计算大于等于h高度的长度
                    int maxLength = citations.length - j;
                    // 计算小于等于h高度的长度
                    while (j < citations.length  && citations[j] <= i){
                        j++;
                    }
                    int minLength = j;
                    if(maxLength >= i && citations.length - i <= minLength && i > hindex){
                        hindex = i;
                    }
                    break;
                }
            }
        }
        return hindex;
    }
}
