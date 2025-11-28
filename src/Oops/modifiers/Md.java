package Oops.modifiers;

class See{

//    public  String publicN = "public";
//    protected String protectedN = "protected";
//    String defaultN = "default";
//    private String privateN = "private";



}
class  AnotherClass extends See{
//    void display(){
//        System.out.println(publicN);
//        System.out.println(protectedN);
//        System.out.println(defaultN);
////        System.out.println(privateN);
//    }

}

class  OutSideTheClass extends AnotherMd{
    void display(){
        System.out.println(publicN);
        System.out.println(protectedN);
        System.out.println(defaultN);
//        System.out.println(privateN);
    }
}

public class Md {

    public static void main(String[] args) {



//        See s = new See();
//        s.display();/

//        AnotherClass ac = new AnotherClass();
//    ac.display();

        OutSideTheClass out = new OutSideTheClass();
        out.display();


//        System.out.println(s.publicN);
//        System.out.println(s.protectedN);
//        System.out.println(s.defaultN);
////        System.out.println(s.privateN);

    }
}
