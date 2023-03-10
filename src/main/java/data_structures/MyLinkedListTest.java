package data_structures;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void GivenKeyNodeWhenDeletedShouldPassLinkedListResult() {
        INode<Integer> myFirstNode = new MyNode<>(56);
        INode<Integer> mySecondNode = new MyNode<>(30);
        INode<Integer> myFourthNode = new MyNode<>(70);
        INode<Integer> myThirdNode = new MyNode<>(40);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myFourthNode);
        myLinkedList.insertAfter(30, myThirdNode);
        System.out.println(myLinkedList.getSize());
        myLinkedList.deleteNodeOfValue(40);
        System.out.println(myLinkedList.getSize());
        myLinkedList.printMyNodes();
        boolean result = mySecondNode.getNext() == myFourthNode;
        Assert.assertTrue(result);
    }
}
