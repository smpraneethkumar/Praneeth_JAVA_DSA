package Samples;

import java.util.Arrays;

public class Q2_Shuffle_the_Array {

    public static void main(String[] args) {

        int [] nums= {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    public  static int[] shuffle(int[] nums, int n) {

        int len= nums.length;
        int  [] ans = new int[len];
        int [] x = new int[n];
        int [] y = new int[n];
        for(int i =0;i<n;i++){

            x[i] = nums[i];
            y[i] = nums[n+i];
        }
        for(int j =0;j<n;j++){
            ans[j+j] = x[j];
            ans[j+1] = y[j];
        }

        return ans;

    }
}
