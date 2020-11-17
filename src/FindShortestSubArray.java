import java.util.*;

public class FindShortestSubArray {
    public static void main(String[] args) {
        System.out.println(findShortestSubArray(new int[]{1}));
    }
    public static int findShortestSubArray(int[] nums) {
        int[] numsCopy = Arrays.copyOf(nums, nums.length);
        //排序
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int max = 0;
        int flag = nums[0];
        // 查找数值最长的度
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == flag){
                count ++;
                if(count > max){
                    max = count;
                }
            }
            else {
                map.put(flag, count);
                flag = nums[i];
                count = 1;
                if(count > max){
                    max = count;
                }
            }
        }
        //保存最后一次
        map.put(flag, count);
        // 寻找数组的度对应的值
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() == max){
                res.add(entry.getKey());
            }
        }
        int minLength = Integer.MAX_VALUE;
        long start = Long.MAX_VALUE;
        long end = Long.MAX_VALUE;
        //寻找最小长度的子数组
        for(int i = 0; i < res.size(); i++){
            int lengt = 0;
            start = Long.MAX_VALUE;
            end = Long.MAX_VALUE;
            for(int j = 0; j < numsCopy.length; j++){
                if(numsCopy[j] == res.get(i) && start == Long.MAX_VALUE){
                    start = j;
                    end = j;
                    lengt ++;
                    if(lengt == max){
                        if(minLength > end - start + 1){
                            minLength = (int) (end- start + 1);
                            break;
                        }
                    }
                    continue;
                }

                if(numsCopy[j] == res.get(i) && start != Long.MAX_VALUE){
                    end = j;
                    lengt ++;
                    if(lengt == max){
                        if(minLength > end - start + 1){
                            minLength = (int) (end- start + 1);
                            break;
                        }
                    }
                }

            }
        }
        return minLength;
    }
}
