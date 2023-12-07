import java.util.List;
import java.util.ListIterator;

public class RemFirstOcurrence {
    public static <E> boolean remove(List<E> list, E element) {
        ListIterator<E> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (element == null ? iterator.next() == null : element.equals(iterator.next())) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
