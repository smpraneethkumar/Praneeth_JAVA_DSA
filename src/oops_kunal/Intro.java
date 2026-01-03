package oops_kunal;

import java.util.Arrays;

public class Intro {

    public static void main(String[] args) {

//        float a[] = new float[2] ;
//
//        System.out.println(Arrays.toString(a));

        Student student1 = new Student(23,"praneeth",50.00f);
        Student student2 = new Student(23,"praneeth kumar",50.00f);

//        student1.name = "fsdfsdf";
//        student1.rno = 01;
//        student1.marks = 23.5f;

        System.out.println(student2.name);
        System.out.println(student1.rno);
        System.out.println(student1.marks);

         final int see = 12;
//see =13;
        System.out.println(see);
    }


}
class Student{

    int rno;
    String name ;//= "sdfsdfsdf";
    float marks;

    Student(int rno,String name,float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
