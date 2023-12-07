import java.util.LinkedList;

public class ReverseLinkedList {
    public static <E> LinkedList<E> reverseLinkedList(LinkedList<E> list) {
        LinkedList<E> reversed = new LinkedList<>();
        for (E element : list) {
            reversed.addFirst(element);
        }
        return reversed;
    }
}
