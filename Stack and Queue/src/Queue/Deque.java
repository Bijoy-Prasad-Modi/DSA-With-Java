package Queue;

import java.util.ArrayDeque;

public class Deque {
    public static void main(String[] args) {
        java.util.Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.add(25);
        deque.addLast(44);
        deque.removeFirst();

        System.out.println(deque);
    }
}
