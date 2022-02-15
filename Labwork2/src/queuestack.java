public class queuestack {
    Node front;
    Node rear;
    public queuestack() {
        front = null;
        rear = null;
    }
    private class Node{
        //data
        int i;
        Node next;
        Node(int i){
            this.i = i;
        }
        public void displayData(){
            System.out.println("i= " + i);
        }
    }
    public void insertLast(int i){
        Node newNode = new Node(i);
        if(isEmpty()){
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
    }
    public int removeFirst(){
        int temp = front.i;
        if(front.next == null){
            rear = null;
        }
        front = front.next;
        return temp;
    }
    public void displayList(){
        Node current = front;
        while(current != null){
            current.displayData();
            current = current.next;
        }
    }
    public int nodeData(){
        return front.i;
    }
    public boolean isEmpty(){
        return front == null;
    }
    public void insert(int item){
        insertLast(item);
    }
    public int remove(){
        if(isEmpty()){
            throw new RuntimeException("the queue is empty..");
        }
        return removeFirst();
    }
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("the queue is empty..");
        }
        return nodeData();
    }
    public static void main(String[] args) {
        queuestack queue = new queuestack();
        queue.insert(6);
        queue.insert(74);
        System.out.println("queue data");
        queue.displayList();
        System.out.println("the item that is been peeked: " + queue.peek());
        System.out.println("removable queue data");
        System.out.println("the removed item: " + queue.remove());
        System.out.println("the removed item: " + queue.remove());
    }
}
