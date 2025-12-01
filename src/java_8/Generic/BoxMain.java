package java_8.Generic;

public class BoxMain {

    public static void main(String[] args) {
//we can pass any datatype in the box
        Box box = new Box("dsf");
        box.container = 221312;
        box.container= 'c';
        System.out.println(box.getValue());

    }
}
