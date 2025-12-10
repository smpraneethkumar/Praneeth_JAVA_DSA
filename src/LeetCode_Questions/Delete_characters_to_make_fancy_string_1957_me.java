package LeetCode_Questions;

public class Delete_characters_to_make_fancy_string_1957_me {

    public static void main(String[] args) {

        String s = "leeetcode";
        System.out.println(makeFancyString(s));

    }
    public  static String makeFancyString(String s){

        String ans = "";
        int fchar = 0;
        int schar = 1;
        int tchar = 2;
        int n = s.length();

        while (fchar < n){
            char one = s.charAt(fchar);
            char two = s.charAt(schar);
            char three = s.charAt(tchar);
            if(one == two && two == three){
                ans += one;
                ans += two;
            }else {
                ans += one;
            }
            fchar++;
            tchar++;
            schar++;
        }
return ans;
    }
}
