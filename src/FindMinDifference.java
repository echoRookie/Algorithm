import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMinDifference {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("00:00");
        list.add("04:00");
        list.add("22:00");
        System.out.println(findMinDifference1(list));
    }
    // 超时,换种做法
    public static int findMinDifference(List<String> timePoints) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < timePoints.size(); i++) {
            for (int j = i + 1; j < timePoints.size(); j++) {
                int temp = timeSpan(timePoints.get(i), timePoints.get(j));
                if (temp < min) {
                    min = temp;
                }
            }
        }
        return min;
    }

    // 计算时间差
    public static int timeSpan(String a, String b) {
        // 计算小时
        int hourA = Integer.parseInt(a.substring(0, 2));
        int hourB = Integer.parseInt(b.substring(0, 2));
        int hourSpan = Math.max(hourA, hourB) - Math.min(hourA, hourB);
        //计算分钟
        int minuteA = Integer.parseInt(a.substring(a.length() - 2, a.length()));
        int minuteB = Integer.parseInt(b .substring(b.length() - 2, b.length()));
        int minuteSpan = 0;
        if (hourA < hourB) {
            minuteSpan = minuteB - minuteA;
        }
        else if(hourA == hourB){
            minuteSpan = Math.abs(minuteA - minuteB);
        }
        else {
            minuteSpan = minuteA - minuteB;
        }
        int res = hourSpan * 60 + minuteSpan;
        return res > 12 * 60 ? 24 * 60 - res : res;
    }

    public static int findMinDifference1(List<String> timePoints) {
        int[] nums = new int[timePoints.size()];
        for (int i = 0; i< nums.length;i++){
            String temp = timePoints.get(i);
            nums[i] = Integer.parseInt(temp.substring(0, 2)) * 60 + Integer.parseInt(temp .substring(temp.length() - 2, temp.length()));;
        }
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i = 0;i<nums.length -1;i++){
            if (nums[i +1] - nums[i] > 12 * 60){
                if(24*60 -(nums[i+1] - nums[i]) < min){
                    min = 24*60 -(nums[i+1] - nums[i]);
                }
            }
            else {
                if(min > nums[i+1] - nums[i]){
                    min = nums[i+1] -nums[i];
                }
            }
        }
        if (nums[nums.length - 1] - nums[0] > 12 * 60) {
            if (24 * 60 - (nums[nums.length - 1] - nums[0]) < min) {
                min = 24 * 60 - (nums[nums.length - 1] - nums[0]);
            }
        } else {
            if (min > nums[nums.length - 1] - nums[0]) {
                min = nums[nums.length - 1] - nums[0];
            }
        }
        return min;
    }
}
