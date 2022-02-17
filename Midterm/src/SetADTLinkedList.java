public class SetADTLinkedList {
    NodeGeneric<String> first;
    NodeGeneric<String> last;
    int size = 0 ;
    // add method
    void add(String a) {
        NodeGeneric<String> new_node = new NodeGeneric<>();
        new_node.data = a;
        new_node.next = null;
        if(size == 0) {
            first = new_node;
        }
        else {
            last.next = new_node;
        }
        last = new_node;
        size++;
    }
    // add method
    void add(int position, String a) {
        NodeGeneric<String> new_node = new NodeGeneric<>();
        new_node.data = a;
        new_node.next = null;
        NodeGeneric<String> y = first;
        NodeGeneric<String> x = first.next;
        while(position  - 2 > 0){
            y = x;
            x = y.next;
            position--;
        }
        new_node.next = x;
        y.next = new_node;
        size++;
    }
    // remove method
    void remove (int position) {
        size--;
    }
    // get + getSize methods
    String get (int position) {
        NodeGeneric<String> iterator = new NodeGeneric<>();
        iterator = first;
        while(position - 1 > 0){
            iterator = iterator.next;
            position--;
        }
        return iterator.data;
    }
    int getSize() {
        return  size;
    }
    /* attempting to implement exceptions code
    public StackUsingArrayWithExceptions(){
        arr = (T[]) new Object[100];
//        arr =  Array.newInstance(arr, 100);
    }
    int top = -1;
    int size = 0;
    public void push(T a) throws FullSetLinkedListException {
        if(size == 2){
            throw new FullSetException("the set is full");
        }
        top ++;
        arr[top] = a;
        size ++;
        }
    public T pop() throws EmptySetLinkedListException {
        if(size == 0)
            throw new EmptySetLinkedListException();
        T temp = arr[top];
        top--;
        size--;
        return temp;
    }
    */
    public static void main(String[] args) {
        SetADTLinkedList obj = new SetADTLinkedList();
        obj.add("1");
        obj.add("3");
        obj.add("5");
        obj.add("1");
        obj.add(3, "1");
        for(int i =1 ;i <= obj.getSize(); i++) {
            System.out.println(obj.get(i));
        }
    }
}
