package data_structures;

public class MyLinkedList {
    public INode head;
    public INode tail;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        size++;
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
        size++;
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
        size++;
        INode tempNode = myFirstNode.getNext();
        myFirstNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode pop() {
        size--;
        INode tempNode = head;
        this.head = head.getNext();
        return tempNode;
    }

    public void popLast() {
        size--;
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode.setNext(null);
    }

    public boolean search(INode myNode) {
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            if (tempNode.getKey() == myNode.getKey()) {
                return true;
            } else {
                tempNode = tempNode.getNext();
            }
        }
        return false;
    }

    public void insertAfter(Integer value, INode myFourthNode) {
        INode tempNode = head;
        size++;
        while (tempNode.getKey() != value) {
            tempNode = tempNode.getNext();
        }
        myFourthNode.setNext(tempNode.getNext());
        tempNode.setNext(myFourthNode);
    }

    public void deleteNodeOfValue(Integer value) {
        size--;
        INode tempNode = head;
        INode tempNodeTwo = tempNode.getNext();
        while (tempNodeTwo.getKey() != value) {
            tempNode = tempNode.getNext();
            tempNodeTwo = tempNode.getNext();
        }
        tempNode.setNext(tempNodeTwo.getNext());
    }

    public int getSize() {
        return size;
    }

    public void sort() {
        INode currentNode = head;
        while (currentNode != null) {
            INode nextNode = currentNode.getNext();
            while (nextNode != null) {
                if ((Integer)currentNode.getKey() > (Integer)nextNode.getKey()) {
                    Integer temp = (Integer)currentNode.getKey();
                    currentNode.setKey(nextNode.getKey());
                    nextNode.setKey(temp);
                }
                nextNode = nextNode.getNext();
            }
            currentNode = currentNode.getNext();
        }
    }
}