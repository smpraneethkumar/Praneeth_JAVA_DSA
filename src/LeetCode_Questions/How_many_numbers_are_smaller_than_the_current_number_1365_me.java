package LeetCode_Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class How_many_numbers_are_smaller_than_the_current_number_1365_me {

    public static void main(String[] args) {



        int [] nums = {8,1,2,2,3};


//        Input: nums
//        = [8,1,
//            int f[] = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

////        int ans[] ={};
//        int n = nums.length;
//        int ans[] = new int[n-1];
//        for(int i =0;i<n-1;i++){
//
//            int total = 0;
////            for(int j =0;j<n-1;j++){
//                    int j =0;
//                    while(i<n-1){
//                System.out.println(i+" "+j);
//                if(nums[j]<nums[i]){
//
//                    total += 1;
//                }
//                else {
//                    total += 0;
//                }
//                j++;
//            }
////            System.out.println(total);
//            ans[i] = total;
//
//        }
//
//        return ans;



        int [] buckets = new int[9];

        for(int num:nums){
            buckets[num]++;
        }

        for(int i =1;i<buckets.length;i++){
            buckets[i] += buckets[i-1];
        }

        int [] result = new int [nums.length];

        for(int i =0;i<result.length;i++){

            if(nums[i] == 0){
                result[i] =0;
            }
            else{
                result[i] = buckets[nums[i]-1];
            }

        }
        return result;

    }
}
