package SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtFirst(3);
        list.insertAtFirst(4);
        list.insertAtFirst(5);
        list.insertAtFirst(6);
        list.insertAtFirst(7);

        list.insertAtLast(40);

        list.insertAtIndex(45,2);
        list.display();

        //System.out.println(list.deleteAtFirst());
        //System.out.println(list.deleteAtLast());
        //👆for this function call the complexity will O(N), but it can be improved
       // System.out.println(list.deleteAtIndex(2)); // Complexity : O(N)

        System.out.println(list.deleteAtValue(6)); // Complexity : Worst - O(N), Best - O(1)
        list.display();
    }

}
