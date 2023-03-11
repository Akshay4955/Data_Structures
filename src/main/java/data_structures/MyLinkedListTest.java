package data_structures;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void GivenLinkedListWhenSortedShouldPassLinkedListResult() {
        INode<Integer> myFirstNode = new MyNode<>(56);
        INode<Integer> mySecondNode = new MyNode<>(30);
        INode<Integer> myFourthNode = new MyNode<>(70);
        INode<Integer> myThirdNode = new MyNode<>(40);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.append(myFourthNode);
        myLinkedList.sort();
        myLinkedList.printMyNodes();
        boolean result = myFirstNode.getKey() == 30 && mySecondNode.getKey() == 40 && myThirdNode.getKey() == 56
                        && myFourthNode.getKey() == 70;
        Assert.assertTrue(result);
    }
}
