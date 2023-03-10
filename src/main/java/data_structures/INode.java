package data_structures;

public interface INode<K> {
    K getKey();
    void setKey(K key);
    INode getNext();
    void setNext(INode next);
}
