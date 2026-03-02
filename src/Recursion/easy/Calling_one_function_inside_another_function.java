package Recursion.easy;

public class Calling_one_function_inside_another_function {

    public static void main(String[] args) {
num_print1(1);

    }
    static void num_print1(int n ){
        System.out.println(n);
        num_print2(2);
    }
    static void num_print2(int n ){
        System.out.println(n);
        num_print3(3);
    }
    static void num_print3(int n ){
        System.out.println(n);

    }
}
