import java.util.LinkedList;

public class linkedadtstack {
    public static void main(String args[]) {
        LinkedList<String> linkedlist = new LinkedList<String>();]
        linkedlist.add("234");
        linkedlist.add("533");
        linkedlist.add("254");
        linkedlist.add("675");
        linkedlist.add("234");
        System.out.println("the items in the linked list: " +linkedlist);
        linkedlist.addFirst("the first item");
        linkedlist.addLast("the last item");
        System.out.println("the linked list after addition: " +linkedlist);
        Object firstvar = linkedlist.get(0);
        System.out.println("the first item: " +firstvar);
        linkedlist.set(0, "the first item changed: ");
        Object firstvar2 = linkedlist.get(0);
        System.out.println("the first item element updated: " +firstvar2);
        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("the first and last items removed: " +linkedlist);
        linkedlist.add(0, "the new item");
        linkedlist.remove(2);
        System.out.println("the last version of the linked list " +linkedlist);
    }
}
