package Oops;

class For_this{

    String name;

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

    }
}
