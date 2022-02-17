import java.util.*;
public class SetADT {
    String [] arr = new String[10];
    int size = 0;
    void add(String a) {
        arr[size + 1] = a;
        size++;
    }
    void add(int position, String a) {
        if(position < size) {
            for(int i = size; i >= position; i--) {
                arr[i + 1] = arr[i];
            }
        }
        arr[position] = a;
        size++;
    }
    void remove(int position) {
        if(position < size) {
            for(int i = position; i < size; i++) {
                arr[i] = arr[i + 1];
            }
        }
        size++;
    }
    String get(int position) {
        return arr[position];
    }
    int getSize() {
        return size;
    }
    public  static void main(String[] args)
    {
        // hash set no duplicates printed
        Set<String> obj = new HashSet<>();
        obj.add("1");
        obj.add("3");
        obj.add("5");
        obj.add("1");
        System.out.println(obj);
        System.out.println(obj.contains("1"));
    }
}
