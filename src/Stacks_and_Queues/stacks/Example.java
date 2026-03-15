package Stacks_and_Queues.stacks;

import java.util.Stack;

public class Example {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(78);
        stack.push(56);
        stack.push(12);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
