
// MyListNode is for storing a single node of a linked list and a value.
public class MyListNode<T>
{
    // data stored in this node
    public T data;
    // link to next node in the list
    public MyListNode<T> next;

    // constructs a node with data null and null link
    public MyListNode()
    {
        //this(null, null);
        this.data = null;
        this.next = null;
    }

    // constructs a node with given data and null link
    public MyListNode(T data)
    {
        this.data = data;
        this.next = null;
    }


}


