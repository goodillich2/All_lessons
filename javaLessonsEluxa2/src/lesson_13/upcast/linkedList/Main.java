package lesson_13.upcast.linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(7);


        Node head = new Node(9);
        head.setNextNode(new Node(7));
        head.getNextNode().setNextNode(new Node(11));
        // [9, 7, 11] -> [1,9,7,11]

        Node head1 = new Node(1);
        head1.setNextNode(head);

        MyLinkedList<Integer> myLinkedList = new MyLinkedList();
        myLinkedList.add(7);
        myLinkedList.add(9);
        myLinkedList.add(10);
        myLinkedList.printList();

        System.out.println();
        MyLinkedList<String> stringMyLinkedList = new MyLinkedList();
        stringMyLinkedList.add("dfef");
        stringMyLinkedList.add("sdwsew3ewe");
        stringMyLinkedList.add("hello");
        stringMyLinkedList.printList();


    }
}


class MyLinkedList<T>{
    Node head;

    <T> void add(T a)
    {
        if(head == null)
        {
            head = new Node(a);
        }
        else { // [1,2,3] -> [1,2,3,9] if a = 9
            Node temp = head;

            while (temp.getNextNode() != null)
            {
                temp = temp.getNextNode();
            }
            temp.setNextNode(new Node(a));
        }
    }

    void printList()
    {
            Node temp = head;

            while (temp != null)
            {
                System.out.print(temp.getA() + " ");  // [8,2,3,4]
                temp = temp.getNextNode();
            }


    }


}


class Node<T>
{
    private T a;
    private Node nextNode;


    public Node(T a) {
        this.a = a;
    }

    public Node(T a, Node nextNode) {
        this.a = a;
        this.nextNode = nextNode;
    }

    public Node() {
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}