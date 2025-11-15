package strings_Kunal;

public class Goal_Parser_Interpretation_1678_KK {

    public static void main(String[] args) {
        String  command = "(al)G(al)()()G";

//      ======  I TRIED TO DO IT BUT THE LAST LETTER IS NOT GETTING IN THE ANS  =======


//        System.out.println(command.charAt(2));
//        for(int )
//            int a =1;
//        int n = command.length();
//        String ans ="";
////        for(int i =0;i<=n;i++){
//            int i =0;
//                while(i<n-1){
//            char ch1 = command.charAt(i);
//            char ch2 = command.charAt(i+1);
//
//            if(ch1 == 'G'){
//                ans += 'G';
//                continue;
//            }
//            if(ch1 == '(' && ch2 == ')'){
//                ans += 'o';
//                continue;
//            }
//            if(ch1 == '(' && ch2 == 'a' ){
//                ans += "al";
//                continue;
//            }
//            i++;
//        }
//
//        System.out.println(ans);


        StringBuilder sb = new StringBuilder();

        int i =0;
        int len = command.length();
        while(i<len){

            if(command.charAt(i) == 'G'){
                sb.append("G");
                i++;
            } else if (command.charAt(i) == '(' && command.charAt(i+1) == ')') {
                sb.append("o");
                i = i +2;

            }
            else {
                sb.append("al");
                i = i+4;
            }
        }

        System.out.println(sb.toString());

    }
}
