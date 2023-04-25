package franxx.code.collection.application;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("MI");
        stack.push("ZE");
        stack.push("NI");

        System.out.println(stack.pop());
    }
}
