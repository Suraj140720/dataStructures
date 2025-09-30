package stacks;
import java.util.Stack;

public class stack0 {
    public static void main(String[] args){

        int[] stocks = {100,80,60,70,60,75,85,100};
        int[] span = new int[stocks.length];

        stack3 s = new stack3();
        boolean b = s.isDuplicate("((a+b)+(b+c))");
        System.out.println(b);
        // stack3 s = new stack3();
        // System.out.println(s.reverseString("Suraj"));

        // Stack<Integer> stack = new Stack<>();
        // stack3 s = new stack3();
        // stack.push(100);
        // stack.push(99);
        // stack.push(98);
        // s.reverseStack(stack);
        // s.printStack(stack);

        // stacks2 s = new stacks2();
        // s.push(0);
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // System.out.println(s.pop());
        // System.out.println(s.peek() + " is the top element");

        // s.printList();
        // System.out.println(s.pop());
        // s.printList();
        // System.out.println(s.peek());
    }
}
