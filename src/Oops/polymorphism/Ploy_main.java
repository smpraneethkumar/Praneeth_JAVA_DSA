package Oops.polymorphism;

class Animal{
String name = "pranaath";

//System.out.println(name);
    void sound(){
        System.out.println("this from animal....");
        System.out.println(name);
    }
}
class  Dog extends Animal{
String name = "praveen Sir";

    @Override
    void sound(){
        System.out.println("this from dog....");
    }
}
public class Ploy_main {

    public static void main(String[] args) {

        Animal ad = new Dog();

        ad.sound();


    }
}
