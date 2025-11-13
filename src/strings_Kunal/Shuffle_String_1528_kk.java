package strings_Kunal;

import java.util.HashMap;
import java.util.Map;

public class Shuffle_String_1528_kk {


    public static void main(String[] args) {

        String s = "codeleet";
        int indices[] = {4, 5, 6, 7, 0, 2, 1, 3};

                                                // THANK YOU GOD FOR YOUR SUPPORT TO DO THIS PROBLEM BY OWN
        // it took me 1-hour to complete

        HashMap< Integer,Character> hm = new HashMap<>();

        int lens = s.length();
        int leni = indices.length;

        System.out.println(lens);
        System.out.println(leni);

//        if(lens==leni) {

            for (int i = 0; i < lens; i++) {
                char c = s.charAt(i);
                int in = indices[i];

                hm.put(in,c);
            }

            String ans = "";
//        for (Map.Entry< Integer,Character> e : hm.entrySet())
//            System.out.println(" Value: " + e.getValue() + "Key: " + e.getKey());

        for(int i =0;i<=hm.size()-1;i++){

            ans += hm.get(i);
        }


        System.out.println(ans);
        }

}
