public class Run
{
    public static void main(String[] args)
    {
        LinkedList<String> stringLinkedList = new LinkedList<>();

        stringLinkedList.add("Seb");
        stringLinkedList.add("Mathias");
        stringLinkedList.add("Jackie");
        stringLinkedList.add("Sebastian");
        stringLinkedList.add("Tino");


        System.out.println(stringLinkedList.toString());

        System.out.println("Size is: " + stringLinkedList.size());

        stringLinkedList.remove(0);

        System.out.println(stringLinkedList.toString());

        System.out.println("Size is: " + stringLinkedList.size());

        stringLinkedList.add("Seb");

        System.out.println("Size is: " + stringLinkedList.size());

        //deliberate mistake to show list can't take any object
        stringLinkedList.add(12);

        System.out.println(stringLinkedList.size());

    }
}
