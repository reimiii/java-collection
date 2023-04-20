package franxx.code.collection.application;

import java.util.Deque;
import java.util.LinkedList;

public class Deques {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();

        stack.offerLast("Hilmi");
        stack.offerLast("Akbar");
        stack.offerLast("Muharrom");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        System.out.println("=================");

        Deque<String> queue = new LinkedList<>();

        queue.offerLast("Hilmi");
        queue.offerLast("Akbar");
        queue.offerLast("Muharrom");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
    }
}
