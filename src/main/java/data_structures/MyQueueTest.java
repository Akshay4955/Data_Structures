package data_structures;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
    @Test
    public void Given3NumbersWhenEnqueuedInQueueShouldPassResult() {
        MyQueue myQueue = new MyQueue();
        INode<Integer> myFirstNode = new MyNode<>(56);
        INode<Integer> mySecondNode = new MyNode<>(30);
        INode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printMyQueue();
        INode peak = myQueue.peak();
        Assert.assertEquals(myFirstNode, peak);
    }
}