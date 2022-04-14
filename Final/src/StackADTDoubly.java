import NodeGeneric.NodeGeneric;
import org.w3c.dom.Node;
import java.util.Vector;
public class StackADTDoubly {
    NodeGeneric<String> first;
    NodeGeneric<String> last;
    int size = 0;
    void add(String a) {
        NodeGeneric<String> new_node = new NodeGeneric<String>();
        new_node.data = a;
        new_node.next = null;
        if(size == 0) {
            first = new_node;
            last = new_node;
        } else {
            last.next = new_node;
            last = new_node;
        } size++;
    }
    void add(int position, String a) {
        NodeGeneric<String> new_node = new NodeGeneric<String>();
        new_node.data = a;
        new_node.next = null;
        NodeGeneric<String> y = first;
        NodeGeneric<String> x = first.next;
        while(position - 2 > 0) {
            y = x;
            x = y.next;
            position--;
        }
        new_node.next = x;
        y.next = new_node;
        size++;
    }
    void remove(int position) {
        size--;
    }
    String get(int position) {
        NodeGeneric<String> iterator = new NodeGeneric<String>();
        iterator = first;
        while(position - 1 > 0) {
            iterator = iterator.next;
            position--;
        } return iterator.data;
    }
    int get_size() {
        return size;
    }
    public static void main(String[] args) {
        Vector<Integer> x = new Vector<Integer>();
        x.add(1);
        x.add(2);
        x.add(3);
        System.out.println(x.size()); //
        System.out.println(x.get(0)); // 1
        x.remove(1);// removing the 2
        System.out.println(x.get(1));//3
    }
}
