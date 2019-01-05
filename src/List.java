//E is a Object!
public interface List<T>
{
    public int size();

    public Object get(int index);

    public String toString();

    public void add(T value);

    public void add(int index, T value);

    public void remove(int index);
}



