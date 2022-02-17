import java.util.*;
public class SetADTArray {
    String [] arr = new String[10];
    // setting the array size
    int size = 1;
    void add(String a) {
        arr[size + 1] = a;
        size++;
    }
    // add method
    void add(int position, String a) {
        if(position < size) {
            for(int i = size; i >= position; i--) {
                arr[i + 1] = arr[i];
            }
        }
        arr[position] = a;
        size++;
    }
    // remove method
    void remove(int position) {
        if(position < size) {
            for(int i = position; i < size; i++) {
                arr[i] = arr[i + 1];
            }
        }
        size++;
    }
    // get + getSize methods
    String get(int position) {
        return arr[position];
    }
    int getSize() {
        return size;
    }
    /* attempting to implement exception code
    public void push(T a) throws SetADTException {
        if(size == 5 ){
            throw new SetADTException("stack full");
        }
        top ++;
        arr[top] = a;
        size ++;
    }
    public T pop() throws EmptySetADTException {
        if(size == 0)
            throw new EmptySetADTException();
        T temp = arr[top];
        top--;
        size--;
        return temp;
    }
    public T peek(){
        return arr[top];
    }
    */
    public  static void main(String[] args)
    {
        // hash set no duplicates printed
        Set<String> obj = new HashSet<>();
        obj.add("1");
        obj.add("3");
        obj.add("5");
        obj.add("1");
        System.out.println(obj);
        System.out.println("does set contain 1: " + obj.contains("1"));
        System.out.println("the size of this set is: " + obj.size());
        obj.remove("1");
        System.out.println(obj);
        System.out.println("checking if set is empty: " + obj.isEmpty());
        System.out.println("clearing set...");
        obj.clear();
        System.out.println("checking if set is empty: " + obj.isEmpty());
    }
}