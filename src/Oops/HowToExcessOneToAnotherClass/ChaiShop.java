package Oops.HowToExcessOneToAnotherClass;


class  StarBucks extends Owner{
    String item = "Coffee";
}

public class ChaiShop {
    public static void main(String[] args) {

        StarBucks sb = new StarBucks();

        System.out.println("this is from another class var "+sb.name);
        System.out.println(sb.item);

    }
}
