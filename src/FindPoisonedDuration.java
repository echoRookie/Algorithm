public class FindPoisonedDuration {
    public static void main(String[] args) {
        System.out.println(findPoisonedDuration(new int[]{1,2}, 3));
    }
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries == null || timeSeries.length <= 0 || duration <= 0){
            return 0;
        }
        int max = 0;
        for (int i = 0; i < timeSeries.length; i++){
            if(i < timeSeries.length -1 && timeSeries[i] + duration - 1 < timeSeries[i + 1]){
                max += duration;
            }
            if(i < timeSeries.length -1 && timeSeries[i] + duration - 1 >= timeSeries[i + 1]){
                max += timeSeries[i + 1] - timeSeries[i];
            }
            if(i == timeSeries.length - 1){
                max += duration;
            }
        }
        return max;
    }
}
