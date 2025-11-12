package LeetCode_Questions;

import java.util.Arrays;

public class Longest_Common_Prefix_14_me {
    public static void main(String[] args) {

        String strs[] = {"flower","flow","fligth"};

      System.out.println(  longestCommonPrefix(strs));






    }
    public static String longestCommonPrefix(String[] strs) {

        String ans = "";

        Arrays.sort(strs);

        String word1 = strs[0];
        String word2 = strs[strs.length -1];

        int i =0;

        while(i<word1.length()){

            if(word1.charAt(i)==word2.charAt(i)){
                i++;
                // ans = ans+word1.charAt(i);
            }
            else{
                // return " ";
                break;
            }


        }

        return i==0? "":word1.substring(0,i);
    }
}
