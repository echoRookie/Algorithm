package Array;

public class TestSix {
    
  public int fib(int N) {
        if(N==1){return 1;}
        int num0=0;
        int num1=1;
        int num2=0;
        for(int k=2;k<=N;k++){
            num2=num1+num0;
            num1=num2;
            num0=num2-num0;
        }
        return num2;
    }
}
