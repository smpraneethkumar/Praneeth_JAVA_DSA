package java_8.Generic;
import java.util.*;
public class GenericMain {
    public static void main(String[] args) {
//--------------THIS IS GENERIC ---------------
        List <String> list = new ArrayList<>();
        list.add("praneeth");


//-------------- THIS NOT A GENERIC--------------
        List anotherList = new ArrayList();
        anotherList.add("azam");
        anotherList.add(42);
        anotherList.add(343.67);
        anotherList.add('f');

        System.out.println(anotherList);

        System.out.println(list);
    }
}
