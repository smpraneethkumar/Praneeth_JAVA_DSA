package Samples;

import java.util.Arrays;

public class Q1_Concatenation_of_Array {


    public static void main(String[] args) {

        int nums[] = {1,3,2,1};

        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

   static public int[] getConcatenation(int[] nums) {
        // int ans[] ={};
        int n = nums.length;
//        System.out.println(n);
        int [] ans = new int[n+n];

        for(int i =0;i<n;i++){

            ans[i] = nums[i];

            ans[n+i] = nums[i];

        }














        // for(int i =0;i<n;i++){

        //     ans[i] = nums[i];

        // }

        // int j =0;
        // while(j<n){
        //     ans[j] = nums[j];
        //     j++;
        // }

        return ans;
    }
}
