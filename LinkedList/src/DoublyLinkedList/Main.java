package DoublyLinkedList;


public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtFirst(3);
        list.insertAtFirst(4);
        list.insertAtFirst(5);
        list.insertAtFirst(6);
        list.insertAtFirst(7);

        //list.insertAtLast(44);

        list.insertAfterNode(5,66);

        list.display();
        list.displayRev();
    }
}
