package Array;

import java.io.Console;

/*����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�

��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�

ʾ�� 1:

�������� nums = [1,1,2], 

����Ӧ�÷����µĳ��� 2, ����ԭ���� nums ��ǰ����Ԫ�ر��޸�Ϊ 1, 2�� 

�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�

ʾ�� 2:

���� nums = [0,0,1,1,1,2,2,3,3,4],

����Ӧ�÷����µĳ��� 5, ����ԭ���� nums ��ǰ���Ԫ�ر��޸�Ϊ 0, 1, 2, 3, 4��

�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء� */

public class Test_26 {
	 public static int removeDuplicates(int[] nums) {
	        int i;
	        int k=1;
	        int length = nums.length;
	        int j;
	        int temp;
	        if(length <= 1){
	            return length;
	        }
	        else{
	             for(i = 1; i < length; i++){
	                for (j=i;j<length;j++){
	                    if(nums[j]>nums[i-1] && nums[j] > nums[k-1]){
	                        temp = nums[i];
	                        nums[i] = nums[j];
	                        nums[j] = temp;
	                        k += 1;
	                        break;
	                    }
	                } 
	               
	             }
	              return k;
	        }
	       
	    }
	 public static void main(String[] args){
		 
	
	 }
}
