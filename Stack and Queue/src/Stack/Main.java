package Stack;

public class Main {
    public static void main(String[] args) throws StackException{
        CustomStack stack = new CustomStack(5); //Internally it will create an Array of size 5

        stack.push(25);
        stack.push(32);
        stack.push(26);
        stack.push(32);
        stack.push(7);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
