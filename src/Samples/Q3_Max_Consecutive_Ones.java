package Samples;

public class Q3_Max_Consecutive_Ones {

    public static void main(String[] args) {

        // THIS QUESTION IS DONE BY ME THROUGT GOD
        int nums[] = {1,1,0,1,1,1};

        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int finalAns = 0;
        int ans =0;

            int count =0;
        for(int i =0;i<n;i++){
            if(nums[i] == 1){
                count++;


            }else {
                ans = Math.max(ans,count);
                count =0;
            }
        }
//            if (count < ans){
//        ans= Math.max(ans,count);
//
//            }

        finalAns = Math.max(ans,count);
        return finalAns;
    }
}
