package LeetCode_Questions;

public class How_many_numbers_are_smaller_than_the_current_number_1365_me {

    public static void main(String[] args) {

        int [] nums = {8,1,2,2,3};


//        Input: nums
//        = [8,1,

        int f[] = smallerNumbersThanCurrent(nums);
        System.out.println(f);

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

//        int ans[] ={};
        int n = nums.length;
        int ans[] = new int[n-1];
        for(int i =0;i<n;i++){

            int total = 0;
            for(int j =0;j<n;j++){

                System.out.println(i+" "+j);
//                if(nums[j]<nums[i]){
//
//                    total += 1;
//                }
//                else {
//                    total = 0;
//                }
            }
//            ans[i] = total;
        }

        return ans;

    }
}
