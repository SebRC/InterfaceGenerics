

public class LinkedList<T> implements List<T>
{
    private ListNode<T> front;  // first value in the list

    //constructs an empty list
    public LinkedList()
    {
        front = null;
    }



    public int size()
    {
        int size = 0;

        //size == 0 then return 0
        if (front == null)
        {
            return size;
        }

        ListNode current = front;

        //counts every node
        while (current != null)
        {
            current = current.next;
            size++;
        }
        return size;
    }


    public T get(int index)
    {
        if (index > size() || index < 0)
        {
            System.out.println("Node not found");
            return null;
        }

        T value = null;
        ListNode<T> current = front;

        for (int i = 0; i <= index; i++)
        {
            if (i == index)
            {
                value = current.data;
            }
            current = current.next;
        }
        return value;
    }

    // returns comma-separated, bracketed version of list
    public String toString()
    {
        if (front == null)
        {
            return "[]";
        }
        else
        {
            String result = "[" + front.data;
            ListNode<T> current = front.next;

            while (current != null)
            {
                result += ", " + current.data;

                current = current.next;
            }

            result += "]";
            return result;
        }
    }

    // appends the given value to the end of the list
    public void add(T value)
    {
        if (front == null)
        {
            front = new ListNode<T>(value);
        }
        else
        {
            ListNode current = front;

            while (current.next != null)
            {
                current = current.next;
            }
            current.next = new ListNode<T>(value);
        }
    }

    // adds a new node to index and move every node past index 1 space right!
    public void add(int index, T value)
    {
        if (front == null)
        {
            front = new ListNode<T>(value);
        }
        else
        {
            ListNode<T> current = front;
            T copyValue = null;

            for (int i = 0; i <= size(); i++)
            {
                if (i >= index)
                {
                    copyValue = current.data;
                    current.data = value;
                    value = copyValue;

                }
                if (current.next == null)
                {
                    current.next = new ListNode(value);
                    break;
                }
                current = current.next;
            }
        }
    }

    //remove specific node and move every node right of index 1 space to the left
    public void remove(int index)
    {
        ListNode current = front;
        Object copyValue;

        for (int i = 0; i <= size(); i++)
        {
            if (i >= index && current.next != null)
            {
                copyValue = current.next.data;
                current.data = copyValue;
            }
            if (current.next.next == null)
            {
                current.next = null;
                break;
            }
            current = current.next;
        }
    }


}