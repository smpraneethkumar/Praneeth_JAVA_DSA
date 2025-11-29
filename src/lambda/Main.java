package lambda;

public class Main {

    public static void main(String[] args) {

// === > 1.
//        MyInter  myI = new MyInterImplements();
//        myI.sayHello();

// === > 2.
//        MyInter i = new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println("this is first anonymous class");
//            }
//        };
//        i.sayHello();

        MyInter i2 = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("this is second anonymous class");
            }
        };

        i2.sayHello();
// === > 3.
//        using  our interface with the help of lambada

        MyInter lam=()-> System.out.println("this is first time i am using lambda");
        lam.sayHello();

        MyInter lam2 =()-> System.out.println("this is second time i am using lambda");
        lam2.sayHello();


        SumInter suminter =( a, b) -> a+b;
        System.out.println(suminter.sum(2,8));
        System.out.println(suminter.sum(4,7));

        LengthInter  len = str ->str.length();
        System.out.println("the length of the string is "+len.getLength("prnaeeth"));
    }
}
