package data_structures;

public class MyStack {
    private final MyLinkedList myLinkedList;
    private int size = 0;

    public MyStack() {
        this.myLinkedList = new MyLinkedList();
    }

    public void push(INode myNewNode) {
        size++;
        myLinkedList.add(myNewNode);
    }

    public void printStack() {
        myLinkedList.printMyNodes();
    }

    public INode peak() {
        return myLinkedList.head;
    }

    public INode pop() {
        size--;
        return myLinkedList.pop();
    }

    public INode peek() {
        return myLinkedList.head;

    }

    public boolean isEmpty() {
        if (myLinkedList.head == null) {
            return true;
        }
        return false;
    }

    public int getSize() {
        return size;
    }
}
