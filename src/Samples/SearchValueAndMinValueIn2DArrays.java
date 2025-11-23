package Samples;

import java.util.Arrays;

public class SearchValueAndMinValueIn2DArrays {

    public static void main(String[] args) {

        int[][] arr = {

                {23,56,83},
                {18,12,7},
                {14,28,66}

        };

        int target = 66;

        int []ans = Search(arr,target);

        System.out.println(Arrays.toString(ans));
    }

    static int[] Search(int[][] arr, int target) {

//		int ans = 0;
        for(int r = 0; r<arr.length;r++) {
            for(int c= 0;c<arr[r].length;c++) {
                if(arr[r][c]== target) {
                    return new int[]{r,c};


                }
            }
        }
        return new int[] {-1,-1};

    }
}