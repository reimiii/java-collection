package franxx.code.collection.application;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
//        Queue<String> queue = new ArrayDeque<>(10);
        Queue<String> queue = new PriorityQueue<>();

        queue.add("Hilmi");
        queue.add("Akbar");
        queue.add("Muharrom");

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }

        System.out.println(queue.size());
    }
}
