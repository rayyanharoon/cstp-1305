import java.util.*;
public class dequeadt {
    static class Node
    {
        int data;
        Node prev, next;
        static Node getnode(int data)
        {
            Node newNode = new Node();
            newNode.data = data;
            newNode.prev = newNode.next = null;
            return newNode;
        }
    };
    static class Deque {
        Node front;
        Node rear;
        int Size;
        Deque()
        {
            front = rear = null;
            Size = 0;
        }
        boolean isEmpty() { return (front == null); }
        int size() { return Size; }
        void insertFront(int data)
        {
            Node newNode = Node.getnode(data);
            if (newNode == null)
                System.out.print("OverFlow\n");
            else {
                if (front == null)
                    rear = front = newNode;
                else {
                    newNode.next = front;
                    front.prev = newNode;
                    front = newNode;
                }
                Size++;
            }
        }
        void insertRear(int data)
        {
            Node newNode = Node.getnode(data);
            if (newNode == null)
                System.out.print("overflow\n");
            else {
                if (rear == null)
                    front = rear = newNode;
                else {
                    newNode.prev = rear;
                    rear.next = newNode;
                    rear = newNode;
                }
                Size++;
            }
        }
        void deleteFront()
        {
            if (isEmpty())
                System.out.print("underflow\n");
            else {
                Node temp = front;
                front = front.next;
                if (front == null)
                    rear = null;
                else
                    front.prev = null;
                Size--;
            }
        }
        void deleteRear()
        {
            if (isEmpty())
                System.out.print("underflow\n");
            else {
                Node temp = rear;
                rear = rear.prev;
                if (rear == null)
                    front = null;
                else
                    rear.next = null;
                Size--;
            }
        }
        int getFront()
        {
            if (isEmpty())
                return -1;
            return front.data;
        }
        int getRear()
        {
            if (isEmpty())
                return -1;
            return rear.data;
        }
        void erase()
        {
            rear = null;
            while (front != null) {
                Node temp = front;
                front = front.next;
            }
            Size = 0;
        }
    }
    public static void main(String[] args)
    {
        Deque dq = new Deque();
        System.out.print(
                "insert element '5' at rear end\n");
        dq.insertRear(5);

        System.out.print(
                "insert element '10' at rear end\n");
        dq.insertRear(10);
        System.out.print("rear end element: " + dq.getRear()
                + "\n");
        dq.deleteRear();
        System.out.print(
                "after deleting rear element new rear"
                        + " is: " + dq.getRear() + "\n");
        System.out.print(
                "inserting element '15' at front end \n");
        dq.insertFront(15);
        System.out.print(
                "front end element: " + dq.getFront() + "\n");

        System.out.print("number of elements in Deque: "
                + dq.size() + "\n");
        dq.deleteFront();
        System.out.print("after deleting front element new "
                + "front is: " + dq.getFront()
                + "\n");
    }
}
