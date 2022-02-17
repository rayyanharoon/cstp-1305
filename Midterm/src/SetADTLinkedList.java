public class SetADTLinkedList {
    NodeGeneric<String> first;
    NodeGeneric<String> last;
    int size = 0 ;
    void add(String a) {
        NodeGeneric<String> new_node = new NodeGeneric<>();
        new_node.data = a;
        new_node.next = null;
        if(size == 0) {
            first = new_node;
            last = new_node;
        }
        else {
            last.next = new_node;
            last = new_node;
        }
        size++;
    }
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
    void remove (int position) {
        size--;
    }
    String get (int position) {
        NodeGeneric<String> iterator = new NodeGeneric<>();
        iterator = first;
        while(position - 1 > 0){
            iterator = iterator.next;
            position--;
        }
        return iterator.data;
    }
    int get_size() {
        return  size;
    }
    public static void main(String[] args) {
        SetADTLinkedList obj = new SetADTLinkedList();
        obj.add("1");
        obj.add("3");
        obj.add("5");
        obj.add("1");
        obj.add(3, "1");
        for(int i =1 ;i <= obj.get_size(); i++) {
            System.out.println(obj.get(i));
        }
    }
}
