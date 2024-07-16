package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InBuiltExamples {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3); // <-- This is the first element in the Queue, So it will get removed first from the Queue
        queue.add(9);
        queue.add(20);
        queue.add(13);
        queue.add(59);

        System.out.println(queue.peek()); // .peek() get the queue but don't remove it
        System.out.println(queue.remove());
    }
}
