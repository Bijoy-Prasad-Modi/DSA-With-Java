package Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(5);
        queue.insert(7);
        queue.insert(43);
        queue.insert(37);
        queue.insert(11);

        queue.display2();

        System.out.println(queue.remove());
        queue.insert(66);
        queue.display2();
    }
}
