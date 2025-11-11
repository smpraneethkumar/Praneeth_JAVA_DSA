package LeetCode_Questions;

public class Longest_Common_Prefix_14_me {
    public static void main(String[] args) {

        String strs[] = {"flower","flow","fligth"};

//        int n = 0;
//        String word1 = strs[n];
//        String word2 = strs[n+1];
//
//        while (word1 && word2){
//
//
//
//        }

        StringBuilder ans = new StringBuilder();

        for(int i =0;i<strs.length;i++){

            String word1 = strs[i];
            // int num =i+1;
            // for(int j =0;j<word1.length();j++){
//
//            for (int j =1;j)
            String word2 = strs[1+i];

            if(word1.charAt(i) == word2.charAt(i)){

                ans.append(word1.charAt(i));
            }
            else{
                ans = new StringBuilder();
            }
        }
        System.out.println(ans);



    }
}
