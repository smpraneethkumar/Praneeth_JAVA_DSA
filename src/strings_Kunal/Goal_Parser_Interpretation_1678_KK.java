package strings_Kunal;

public class Goal_Parser_Interpretation_1678_KK {

    public static void main(String[] args) {
        String  command = "(al)G(al)()()G";

//        System.out.println(command.charAt(2));
//        for(int )
//            int a =1;
        int n = command.length();
        String ans ="";
//        for(int i =0;i<=n;i++){
            int i =0;
                while(i<n-1){
            char ch1 = command.charAt(i);
            char ch2 = command.charAt(i+1);

            if(ch1 == 'G'){
                ans += 'G';
                continue;
            }
            if(ch1 == '(' && ch2 == ')'){
                ans += 'o';
                continue;
            }
            if(ch1 == '(' && ch2 == 'a' ){
                ans += "al";
                continue;
            }
            i++;
        }

        System.out.println(ans);
    }
}
