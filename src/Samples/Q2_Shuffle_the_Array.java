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

        int count = 0;
        for(int i =0;i<n;i++){
            ans[count] = nums[i];
            ans[count+1] = nums[i+n];
            count+=2;
        }

        return ans;

    }
}
