package data_structures;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
    @Test
    public void Given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
        INode<Integer> myFirstNode = new MyNode<>(56);
        INode<Integer> mySecondNode = new MyNode<>(30);
        INode<Integer> myThirdNode = new MyNode<>(70);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        INode peak = myStack.peak();
        Assert.assertEquals(myThirdNode, peak);
    }

    @Test
    public void Given3NumbersWhenPoppedShouldGetLastAddedNode() {
        INode<Integer> myFirstNode = new MyNode<>(56);
        INode<Integer> mySecondNode = new MyNode<>(30);
        INode<Integer> myThirdNode = new MyNode<>(70);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode pop = myStack.pop();
        myStack.printStack();
        Assert.assertEquals(myThirdNode, pop);
    }

    @Test
    public void GivenStackWhenPeekShouldGetLastAddedNode() {
        INode<Integer> myFirstNode = new MyNode<>(56);
        INode<Integer> mySecondNode = new MyNode<>(30);
        INode<Integer> myThirdNode = new MyNode<>(70);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode peek = myStack.peek();
        System.out.println("Size is " + myStack.getSize());
        myStack.printStack();
        Assert.assertEquals(myThirdNode, peek);
    }

    @Test
    public void GivenEmptyStackWhenCalledIsEmptyShouldGetTrue() {
        MyStack myStack = new MyStack();
        boolean status = myStack.isEmpty();
        Assert.assertTrue("Stack is empty", status);
    }
}