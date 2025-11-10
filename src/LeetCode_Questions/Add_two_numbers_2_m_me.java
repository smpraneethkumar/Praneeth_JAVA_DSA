package LeetCode_Questions;

import java.util.LinkedList;

public class Add_two_numbers_2_m_me {

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        LinkedList<Integer> ans = new LinkedList<>();

        l1.add(2);
        l1.add(4);
        l1.add(3);

        l2.add(5);
        l2.add(6);
        l2.add(4);

        int ex =0;

        for(int  i =0; i<l1.size();i++) {

            for(int j =i;j<=i;j++) {

                int num1 = l1.get(i);
                int num2 = l2.get(j);

                int sum = num1 + num2 + ex;

                if(sum >=10) {

                    int sub = 9;
                  ex = sum -sub;
//                 System.out.println(d);
//                    ex = Math.min(ex,sum);
                }

                ans.add(sum);
//				 sum = 0;
            }
        }

        System.out.println(ans);

//        boolean t =l1.size() || l2.size() ;
//        if(t == true ){
//
//            System.out.println("sfdsdffsdf");
//        }


    }
}