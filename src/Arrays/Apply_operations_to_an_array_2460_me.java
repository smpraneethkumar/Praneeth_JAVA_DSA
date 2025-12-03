package Arrays;
import java.util.*;
public class Apply_operations_to_an_array_2460_me {

    public static void main(String[] args) {
        int nums[] = {1,2,2,1,1,0};
        System.out.println(Arrays.toString(applyOperations(nums)));
    }
    public static int[] applyOperations(int[] nums) {
        int n = nums.length;

        int [] result = new int[n];

        for(int i =0;i<n-1;i++){

            if(  nums[i] == nums[i+1]){

                nums[i] = nums[i] * 2;
                nums[i+1] = 0;

            }
            else {
                nums[i] = nums[i];
            }
//            i++;
        }

        int index = 0;

        for(int i =0;i<n;i++){

            if(nums[i] != 0){

                result[index++] = nums[i];
            }
        }

        return result;
    }
}
