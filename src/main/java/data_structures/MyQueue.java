package data_structures;

public class MyQueue {
    private final MyLinkedList myLinkedList;

    public MyQueue() {
        myLinkedList = new MyLinkedList();
    }

    public void enqueue(INode newNode) {
        myLinkedList.append(newNode);
    }

    public void printMyQueue() {
        myLinkedList.printMyNodes();
    }

    public INode peak() {
        return myLinkedList.head;
    }

}
