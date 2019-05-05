class Solution {
    public int lengthOfLastWord(String s) {
		int len=s.length();
		int start=-1;
		int end=-1;
		char empy=' ';
		for(int i=len-1;i>=0;i--){
			char c=s.charAt(i);
			if(c==empy&&end==-1) continue;
			if(end==-1) end=i;
			if(c==empy){
				start=i;
				break;
			}
		}
		if(end==-1) return 0;
		return end-start;
    }
    
}