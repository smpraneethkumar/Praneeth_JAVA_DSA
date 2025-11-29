package lambda;

@FunctionalInterface
public interface MyInter {
    public abstract void sayHello();

//    public abstract  void another();
//    if the interface contains only one abstract method then it is functional interface
}

//HOW TO MANY TO CREATE
// 1. crate separate class and implements  to this interface
// 2. anonymous class for implementing interface
// 3. lambda expression