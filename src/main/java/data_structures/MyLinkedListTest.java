package data_structures;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void GivenElementWhenFoundShouldPassLinkedListStatus() {
        INode<Integer> myFirstNode = new MyNode<>(56);
        INode<Integer> mySecondNode = new MyNode<>(30);
        INode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        boolean status = myLinkedList.search(mySecondNode);
        myLinkedList.printMyNodes();
        Assert.assertTrue(status);
    }
}
