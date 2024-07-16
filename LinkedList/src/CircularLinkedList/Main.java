package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(5);
        list.insert(4);
        list.insert(2);
        list.insert(8);
        list.insert(9);

        list.display();

        list.deleteAfterValue(2);

        list.display();
    }
}
