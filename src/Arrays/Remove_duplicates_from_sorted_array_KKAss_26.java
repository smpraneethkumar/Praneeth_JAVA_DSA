package Arrays;

import java.util.Arrays;

public class Remove_duplicates_from_sorted_array_KKAss_26 {

    public static void main(String[] args) {

//        int [] nums = {0,1,2,2};
        int [] nums = {0,0,1,1,1,2,2,3,3,4};

//        System.out.println(removeDuplicates(nums));

        int ans = 0;

        for(int i =0;i<nums.length;i++){

            if(nums[i] == i ){
                int temp = nums[i];
                nums[i] = temp;
                ans++;
            }else {
                nums[i] =0;
            }

            if(nums[i+1] == i ){
                int temp = nums[i];
                nums[i] = temp;
                ans++;
            }else {
                nums[i] =0;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(ans);
    }

//     static  public int removeDuplicates(int[] nums) {
//
//
//    }

}
