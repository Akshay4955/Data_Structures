package data_structures;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void When3NumberGivenAddedToTopOfLinkedListTestShouldPass() {
        INode<Integer> myFirstNode = new MyNode<>(56);
        INode<Integer> mySecondNode = new MyNode<>(30);
        INode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
                        && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);

    }
}
