package Oops;

class ChaiShop{

    String brand = "StarBucks";
    int Coffee = 70;
    int totalSell = 10;
    int revene = Coffee*totalSell;


}
//class Bank(String s,int d,int h) {
//
//    String bankName
////    String books[] = {"maths","science","english","coding"};
//    int totalBooksSoldToday;
//    int pen;
//}
public class Using_class_objects {

    public static void main(String[] args) {

            ChaiShop branch1 = new ChaiShop();
            System.out.println(branch1.revene);
//            Bank b = new Bank("ATP",40,10);

    }
}
