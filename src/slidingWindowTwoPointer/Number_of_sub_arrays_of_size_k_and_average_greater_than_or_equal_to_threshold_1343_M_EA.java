package slidingWindowTwoPointer;

public class Number_of_sub_arrays_of_size_k_and_average_greater_than_or_equal_to_threshold_1343_M_EA {

    public static void main(String[] args) {

        int arr[] = {2,2,2,2,5,5,5,8};

        int k = 3;
        int threshold = 4;

        System.out.println(numOfSubarrays(arr,k,threshold));
    }
    public static  int numOfSubarrays(int[] arr, int k, int threshold) {

        int n = arr.length;
        int temp =0;
        int ans=0;
        int l =0;


        for(int i =0;i<n;i++){
            temp += arr[i];

            if(i-l == k){
                temp = temp - arr[l];
                l++;
            }
            if(i-l+1 == k){

                if(temp/k>=threshold){
                    ans++;
                }
            }

        }
        return ans;
    }
}