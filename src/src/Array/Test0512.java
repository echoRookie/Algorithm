class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		int sum = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			int num = romanMap.get(s.charAt(i));
			if (i != 0) {
				int preNum = romanMap.get(s.charAt(i - 1));
				if (num / preNum == 5 || num / preNum == 10) {
					sum += num - preNum;
					i--;
					continue;
				}
			}
			sum += num;
		}
		return sum;
    }
}