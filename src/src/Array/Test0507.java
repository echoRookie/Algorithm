class Solution {
   public int countSegments(String s) {
        boolean isChar = false;
        int count=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c==' ') isChar = false;
            else{
                if(!isChar) count++;
                isChar=true;
            }
        }
        return count;
    }
    
}