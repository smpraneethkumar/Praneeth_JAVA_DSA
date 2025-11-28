package Oops.HowToExcessOneToAnotherPackage;

import Oops.HowToExcessOneToAnotherClass.Owner;
//we have to import if the class is in another package

class StarBucks2 extends Owner{

    String items = "Tea";
}
public class ChaiShop_2 {

    public static void main (String [] args){

        StarBucks2 sb2 = new StarBucks2();

        System.out.println("for another package"+sb2.name);
        System.out.println(sb2.items);

    }
}
