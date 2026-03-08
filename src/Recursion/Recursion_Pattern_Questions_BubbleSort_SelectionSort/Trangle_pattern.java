package Recursion.Recursion_Pattern_Questions_BubbleSort_SelectionSort;

public class Trangle_pattern {

    public static void main(String[] args) {
        triangle1(5);
        System.out.println();
        triangle2(5);

    }

    static  void  triangle1(int n ){

        if (n < 1){
            return;
        }

        triangle1(n-1);
        for(int i =0;i<n;i++){

            System.out.print("* ");
        }

        System.out.println();



    }

    static  void  triangle2(int n ){

        if (n < 1){
            return;
        }

        for(int i =0;i<n;i++){

            System.out.print("* ");
        }

        System.out.println();
        triangle2(n-1);



    }
}
