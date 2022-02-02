public class stackadtwitharray {
    int size;
    int arr[];
    int top;
    stackadtwitharray(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }
    public void push(int pushedElement) {
        if (!isFull()) {
            top++;
            arr[top] = pushedElement;
            System.out.println("the pushed element is:" + pushedElement);
        } else {
            System.out.println("the stack is full");
        }
    }
    public int pop() {
        if (!isEmpty()) {
            int returnedTop = top;
            top--;
            System.out.println("the popped element is:" + arr[returnedTop]);
            return arr[returnedTop];

        } else {
            System.out.println("the stack is empty");
            return -1;
        }
    }
    public int peek() {
        if(!this.isEmpty())
            return arr[top];
        else
        {
            System.out.println("the stack is empty");
            return -1;
        }
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (size - 1 == top);
    }
    public static void main(String[] args) {
        stackadtwitharray StackCustom = new stackadtwitharray(10);
        StackCustom.pop();
        StackCustom.push(5);
        StackCustom.push(27);
        StackCustom.push(94);
        StackCustom.push(23);
        StackCustom.pop();
        StackCustom.pop();
        StackCustom.pop();
    }
}
