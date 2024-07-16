package BinaryTree;

import java.util.Scanner;

//We will implement it from scratch
class BinaryTree {

    public BinaryTree() {
    }

    //to built tree we need node
    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    //insert element
    //It will take a scanner
    public void populate(Scanner scanner) {
        System.out.println("Enter the root Node value : ");
        int value = scanner.nextInt();
        //then my root is going to be, we will create a new node with this value
        root = new Node(value);
        //once the root Node is added we will call the recursion function that will fill the entire tree
        populate(scanner, root);
    }


    //Recursion function
    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of" + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);

        }

        System.out.println("Do you want to enter right of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    //Now we write the display function to see it is being displayed in a nice way
    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null){
            return;
        }

        System.out.println(indent + node.value);
        display(node.left + indent + "\t");
        display(node.right + indent + "\t");
    }

    private void display(String s) {
    }


}
