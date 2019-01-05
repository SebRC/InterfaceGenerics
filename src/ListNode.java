
// ListNode is for storing a single node of a linked list and a value.
public class ListNode<T>
{
    public T data;    // data stored in this node
    public ListNode<T> next;  // link to next node in the list

    // constructs a node with data null and null link
    public ListNode()
    {
        //this(null, null);
        this.data = null;
        this.next = null;
    }

    // constructs a node with given data and null link
    public ListNode(T data)
    {
        this.data = data;
        this.next = null;
    }


}


