package Oops;

class For_this{

    String name;

   final int b = 2;

    For_this(String father){

        System.out.println(father);
        System.out.println(name);
        this.name = father;
        System.out.println(name);


    }
}
public class Keywords {


    public static void main(String[] args) {

        For_this th = new For_this("praveen");
//th.b = 9;  //-- WE CAN'T CHGENC THE VALUE OF THE b IT IS FINAL KEYWORD
        System.out.println(th.b);
    }
}
