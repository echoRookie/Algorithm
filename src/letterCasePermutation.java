import java.util.ArrayList;
import java.util.List;

public class letterCasePermutation {
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        result = letterCasePermutation("12345");
        for (String s: result) {
            System.out.println(s);
        }
    }
    public static List<String> letterCasePermutation(String S) {
        List<String> result = new ArrayList<>();
        if(S != null && S.length() > 0){
            StringBuilder stringBuilder = new StringBuilder();
            backtrack(S.toCharArray(), stringBuilder, result, 0);
        }
        return result;

    }

    public static void backtrack(char nums[],  StringBuilder str, List<String> result, int index){
        if(str.length() == nums.length){
            result.add(str.toString());
            return;
        }
        for(int i= index; i < nums.length; i++){
            if(Character.isDigit(nums[i])){
                str.append(nums[i]);
                backtrack(nums, str, result, i+1);
                str.deleteCharAt(str.length() -1);
            }
            if(Character.isLetter(nums[i])){
                char[] letterArray = new char[2];
                letterArray[0] = Character.toLowerCase(nums[i]);
                letterArray[1] = Character.toUpperCase(nums[i]);
                for (int j = 0; j <letterArray.length; j++){
                    str.append(letterArray[j]);
                    backtrack(nums,str, result, i+1);
                    str.deleteCharAt(str.length() -1);
                }
            }

        }

    }
}
