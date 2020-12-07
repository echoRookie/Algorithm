public class Compress {
    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a', 'a', 'a', 'a','a','b'}));
    }
    public static int compress(char[] chars) {
        int start = 0;
        int end = 0;
        int length = 0;
        int index= 0;
        while (end < chars.length){

            while (end < chars.length && chars[start] == chars[end] ){
                 ++ end;
            }
            int count = end -start;
            if(count == 1){
                length += 1;
                chars[index] = chars[start];
                 ++ index;
            }
            else {
                String str = chars[start] + String.valueOf(count);
                length = length + str.length();
                for (int i = 0; i< str.length();i++){
                    chars[index + i] = str.charAt(i);
                }
                index += str.length();
            }
            start = end;

        }
        return length;
    }
}
