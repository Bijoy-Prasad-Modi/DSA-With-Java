package DoublyLinkedList;

public class DLL {

    private Node head;


    //Inserting at start
    public void insertAtFirst(int val) { //inserting a value at start of the list by creating new Node and putting the val in it
        //new Node is being created
        Node node = new Node(val);
        //updating the head
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    //Inserting at last
    public void insertAtLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = null;
    }


    public Node find(int val) { //👈 putting any number over here will return the reference pointer to that node
        //it will be a Node type val
        Node node = head;
        while(node != null){
            if (node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    //Inserting a Node after a Node which value is given to you
    public void insertAfterNode(int after, int val){
        Node p = find(after);

        if (p == null){
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null){
            node.next.prev = node;
        }
    }


    //Display the DLL
    public void display() {
        Node node = head;

        //System.out.print("Null<-");
        while (node != null) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println("End");


    }


    //Display the DLL in reverse
    public void displayRev() {
        Node node = head;
        Node last = null;
        while (node != null) {
            last = node;
            node = node.next;
        }

        System.out.println("Print in reverse");

        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
        ;
    }



    public class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
