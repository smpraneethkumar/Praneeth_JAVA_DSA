package Samples;
import java.util.*;
public class Methods {

    public void print(String s){
        System.out.println(s);
    }

    public static  void main(String[] args){
        Methods printer = new Methods();
        List<String> names = Arrays.asList("ram", "sam");

        names.forEach(printer::print);
    }
}
