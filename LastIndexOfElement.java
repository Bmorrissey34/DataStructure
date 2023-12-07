import java.util.List;
import java.util.ListIterator;

public class LastIndexOfElement {
    public static <E> int lastIndexOf(List<E> list, E element) {
        ListIterator<E> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            if (element == null ? iterator.previous() == null : element.equals(iterator.previous())) {
                return iterator.nextIndex();
            }
        }
        return -1;
    }
}
