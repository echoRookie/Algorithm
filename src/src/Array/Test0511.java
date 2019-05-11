package Array;

public class Test0511{
   public:
    string toLowerCase(string str) {
        int strSize = str.size(), num = 'a' - 'A';
        //扫描整个字符串
        for (int index = 0; index < strSize; ++index){
            if (str[index] >= 'A' && str[index] <= 'Z'){//遇到了大写字母
                str[index] += num;
            }
        }
        return str;
    }

}
