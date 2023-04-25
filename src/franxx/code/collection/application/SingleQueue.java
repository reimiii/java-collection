package franxx.code.collection.application;

import java.util.Queue;

public class SingleQueue {
    public static void main(String[] args) {
        Queue<String> queue = new franxx.code.collection.SingleQueue<>();
        System.out.println(queue.size());

        System.out.println(
                queue.offer("Mee")
        );
        System.out.println(
                queue.offer("Moo")
        );
        System.out.println(
                queue.offer("Koo")
        );

        System.out.println(queue.size());

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.size());
    }
}
