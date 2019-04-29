package Array;

public class TestEight {
	public static Boolean isPalindrome(String str){
	boolean result=false;
	for(int i=0; i<str.length()/2;i++){
		if(str.charAt(i) == str.charAt(str.length()-1-i)){
			result=true;
		}else{
			return result;
		}
	}
	return result;
	}

}
