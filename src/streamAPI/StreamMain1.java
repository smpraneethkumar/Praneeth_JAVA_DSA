package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class StreamMain1 {

    public static void main (String[] args){

//    Q)    create a list and filter all even numbers from list
//
         List <Integer> list1 = List.of(2,4,3,8,9,5,2);
//        System.out.println(list1);


        List<Integer> list2 = new ArrayList<>();
        list2.add(21);
        list2.add(23);
        list2.add(51);
        list2.add(61);
        list2.add(20);

        List<Integer> list3 = Arrays.asList(23,78,90,46,23);

//    list1
//        WITHOUT STREAM
        List<Integer> listEven = new ArrayList<>();

        for(int i:list1){
            if(i%2 == 0){
                listEven.add(i);
            }
        }
        System.out.println(listEven);
        System.out.println(list1);

//         USING WITH STREAM
//
//         Stream<Integer> stream = list1.stream();
//        List<Integer>  newList =  stream.filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(newList);

        List<Integer>    newList= list1.stream().filter(i->i%2==0).collect(Collectors.toList());
    }
}
