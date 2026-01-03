package oops_kunal;

import java.util.Arrays;

public class Intro {

    public static void main(String[] args) {

//        float a[] = new float[2] ;
//
//        System.out.println(Arrays.toString(a));

        Student student1 = new Student();

        student1.name = "fsdfsdf";

        System.out.println(student1.name);
    }


}
class Student{

    int rno;
    String name = "sdfsdfsdf";
    float marks;
}
