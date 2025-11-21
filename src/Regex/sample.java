package Regex;
import java.util.regex.*;
public class sample {

    String regex = "for\\s*\\(\\s*int\\s+i\\s*=\\s*(-?\\d+)\\s*;\\s*i\\s*([<>!=]+)\\s*(-?\\d+)\\s*;\\s*i\\s*(\\+\\+|--|\\+=\\s*\\d+|-=?\\s*\\d+)\\s*\\)";
    String line = "for (int i = 0; i < 10; i+=2)";

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(line);

//        if (matcher.find()) {
//        System.out.println("Matched!");
//    } else {
//        System.out.println("Not matched");
//    }
}
