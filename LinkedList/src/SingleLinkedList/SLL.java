package SingleLinkedList;

public class SLL {
    //linked list also having a head and tail
    private Node head;
    private Node tail;
    private int size; //size of the linked list

    public SLL() {
        this.size = 0;
    }

    //inserting an element at the beginning of the linked list or at first index
    public void insertAtFirst(int val) {
        //create a new Node first
        Node node = new Node(val);
        node.next = head;
        //updating the head to point it to the new Node
        head = node;

        if (tail == null) { // if (tail == null) -> means first item being added
            tail = head;
        }
        size += 1;
    }


    //inserting an element at the end of the linked list or at last index
    public void insertAtLast(int val) {
        if (tail == null) { // if (tail == null) -> means first item being added
            insertAtFirst(val);
            return;
        }

        //create a new Node first
        Node node = new Node(val);
        //updating the tail to point it to the new Node
        tail.next = node;
        //making the new node as tail
        tail = node;
        size++;
    }

    //inserting an element at middle, at given index
    public void insertAtIndex(int val, int index) {
        //if index==0, that means insert at the val at first
        if (index == 0) {
            insertAtFirst(val);
            return;
        }
        if (index == size) {
            insertAtLast(val);
            return;
        }
        // traversing the array from the start till index
        Node temp = head;

        //we have to reach the previous index of the targeted index
        //So we will start traversing from start(head) till the previous index, using for loop
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        //create a new Node first
        //to create a new node first we need to pass the value and we need to pass the next indexes
        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    //Deleting the first node of the linked list
    public int deleteAtFirst() { //it's integer type because it's gonna delete the first element
        if (head == null) {
            // If the list is empty, there's nothing to delete
            return -1; // Or throw an exception, depending on your requirements
        }

        int val = head.val; // Store the value of the first node

        if (head.next == null) {
            // If there's only one node in the list
            head = null;
            tail = null;
        } else {
            // If there are multiple nodes in the list
            head = head.next; // Update the head pointer to the next node
        }

        size--; // Decrement the size of the list
        return val; // Return the value of the deleted node
    }

    // Deleting the last node of the linked list
    //function to delete the last element
    public int deleteAtLast() {
        if (size <= 1 && head == null) { // when there is only one item in the list
            // When there is only one item in the list, throw an exception
            throw new IllegalStateException("Cannot delete from an empty list or list with only one element");

            // return deleteAtFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.val;
        tail = secondLast; //while secondLast item became tail of the list
        tail.next = null; // Obviously tail's next item will become null
        //Now we are returning the removed item
        return val;
    }


    //function to get the reference pointer to the node we want to reach, we will create a get function
    //getting Node of the given index , throwing a index value and getting a Node for that
    public Node get(int index) { //👈 putting any number over here will return the reference pointer to that node
        //it will be a Node type val
        Node node = head;

        //Move ahead, index times
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    //Deleting a Node at a particular value

    public int deleteAtValue(int value) {

        // Check if the list is empty
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        // Check if the node to be deleted is the first node
        if (head.val == value) {
            return deleteAtFirst();
        }

        // Search for the node before the node to be deleted
        Node prevNode = head;
        while (prevNode.next != null && prevNode.next.val != value) {
            prevNode = prevNode.next;
        }

        // Check if the node with the specified value is found
        if (prevNode.next == null) {
            throw new IllegalArgumentException("Value not found in the list");
        }

        // Store the value of the deleted node
        int deletedValue = prevNode.next.val;


        // Delete the node by updating the next reference of the previous node
        prevNode.next = prevNode.next.next;
        size--;

        return deletedValue;


//        int deletedValue;
//        if (tail.val == value) {
//            return deleteAtLast();
//        } else {
//
//            //get the Node behind the targeted node, using get function that we already been created
//            Node nodeToBeDeleted = find(value);
//
//
//            //It is not possible to directly access the previous node using
//            // Node prevNode = nodeToBeDeleted-1;
//
//
//            // Instead, we need to traverse the list again to find the node before the one to be deleted
//
//
//            // Assigning the value of node to be deleted to the variable name nodeToBeDeleted
//            deletedValue = nodeToBeDeleted.val;
//
//            //then updating the next of the behind Node of the targeted Node,
//            // Addressing towards the front Node of the targeted Node
//            prevNode.next = prevNode.next.next;
//            size--;
//        }
//        return deletedValue; //So, that we can return the deleted node's value
    }




//    public int deleteAtValue(int value) {
//        // Find the node with the target value
//        Node nodeToDelete = find(value);
//        if (nodeToDelete == null) {
//            return -1; // Value not found, return -1 or throw an exception
//        }
//
//        Node current = head;
//        Node prev = null;
//
//        // Traverse the list to find the node before the node to delete
//        while (current != null && current != nodeToDelete) {
//            prev = current;
//            current = current.next;
//        }
//
//        // If the node to delete is the head node
//        if (prev == null) {
//            head = head.next;
//        } else {
//            prev.next = current.next;
//        }
//
//        // Decrement the size of the list
//        size--;
//
//        // Return the value of the deleted node
//        return nodeToDelete.val;
//    }


    //Here, we are getting Node for a particular value
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

//    Suggested function by chat GPT
//    public int deleteAtLast() {
//        if (head == null) {
//            // List is empty, handle this case
//            return -1; // Or throw an exception, depending on your requirements
//        }
//
//        int deletedValue;
//        if (head.next == null) {
//            // If there's only one node in the list
//            deletedValue = head.val;
//            head = null;
//            tail = null;
//        } else {
//            // Traverse to the second-to-last node
//            Node current = head;
//            while (current.next.next != null) {
//                current = current.next;
//            }
//
//            // Store the value of the last node
//            deletedValue = current.next.val;
//
//            // Update the tail pointer
//            tail = current;
//
//            // Delete the last node
//            current.next = null;
//        }
//
//        size--; // Decrement the size of the list
//        return deletedValue; // Return the value of the deleted node
//    }

    // Deleting Node at a Particular index


    public int deleteAtIndex(int index) {
        if (index == 0) {
            return deleteAtFirst();
        }
        int deletedValue;
        if (index == size - 1) {
            return deleteAtLast();
        } else {

            //get the Node behind the targeted node, using get function that we already been created
            Node prevNode = get(index - 1);


            // Assigning the value of node to be deleted to the variable name deletedValue
            deletedValue = prevNode.next.val;

            //then updating the next of the behind Node of the targeted Node,
            // Addressing towards the front Node of the targeted Node
            prevNode.next = prevNode.next.next;
            size--;
        }
        return deletedValue; //So, that we can return the deleted node's value
    }


    //Display function : How we display the linked list by using a temporary function
    public void display() {
        //assigning head to temp & change in temp will not head temp
        //As we are not modifying the Nodes we are just re-assigning to Next Next Next Nodes
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }


    //linked list has a private class node & it has value (int) and an address (Node next)
    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
