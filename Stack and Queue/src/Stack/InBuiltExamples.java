package Stack;

import java.util.Stack;

public class InBuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //inserting element in stack
        stack.push(5);  // <-- This is the first in element, it will be out last
        stack.push(13);
        stack.push(92);
        stack.push(35);
        stack.push(61);

        //Removing Items(elements) from array
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
