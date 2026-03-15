package Stacks_and_Queues.stacks;

public class StackMain {

    public static void main(String[] args) {

        CustomStacks stack = new CustomStacks(3);

        stack.push(4);
        stack.push(1);
        stack.push(2);
        stack.push(6);

        System.out.println(stack.push(4));
    }
}
