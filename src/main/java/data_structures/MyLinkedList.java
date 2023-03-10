package data_structures;

public class MyLinkedList {
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void printMyNodes() {
        if (head == null) {
            System.out.println("linked list is empty");
        } else {
            StringBuffer myNodes = new StringBuffer("My nodes are ");
            INode tempNode = head;
            while (tempNode.getNext() != null) {
                myNodes.append(tempNode.getKey());
                if (!tempNode.equals(tail)) myNodes.append("->");
                tempNode = tempNode.getNext();
            }
            myNodes.append(tempNode.getKey());
            System.out.println(myNodes);
        }
    }

    public void append(INode newNode) {
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            INode tempNode = this.tail;
            tempNode.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insertBetween(INode myFirstNode, INode newNode) {
        INode tempNode = myFirstNode.getNext();
        myFirstNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
}
