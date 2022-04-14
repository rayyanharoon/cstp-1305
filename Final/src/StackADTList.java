import java.nio.file.ClosedDirectoryStreamException;
import java.util.Stack;
import java.util.Vector;
import java.util.List;
public class StackADTList {
    static void stack_push(Stack<Integer> stack) {
        for(int i = 0; i < 5; i++) {
            stack.push(i);
        } //throw new RuntimeException();
    }
    static void stack_pop(Stack<Integer> stack) {
        for(int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        } //throw new RuntimeException();
    }
    static void stack_peek(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println(element);
        //throw new RuntimeException();
    }
    public static void main(String[] args) {
//        Vector<Integer>  x = new Vector<Integer>();
//        x.add(1);
//        x.add(2);
//        x.add(3);
//        System.out.println(x.size()); //
//        System.out.println(x.get(0)); // 1
//        x.remove(1);// removing the 2
//        System.out.println(x.get(1));//3
        Stack<Integer> stack = new Stack<Integer>();
        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
    }
}
