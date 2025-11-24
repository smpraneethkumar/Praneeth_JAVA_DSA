package Arrays;

import java.util.Arrays;

public class Remove_duplicates_from_sorted_array_KKAss_26 {

    public static void main(String[] args) {

        int [] nums = {0,1,2,2};
//        int [] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));
//        int ans = 0;
//        for(int i =0;i<nums.length;i++){
//            if(nums[i] != i ){
//                ans++;
//            }else {
//                nums[i] =0;
//            }
//        }
    }

     static  public int removeDuplicates(int[] nums) {

        int rd =0;
        int n = nums.length;

        for(int i =0;i<n;i++){

            if(nums[rd] != nums[i]){
                    rd++;
                nums[rd] = nums[i];

            }
        }
        return rd+1;

    }

}
