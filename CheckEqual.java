import java.util.List;
import java.util.ListIterator;

public class CheckEqual {
    public static <E> boolean equals(List<E> list1, List<E> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }

        ListIterator<E> it1 = list1.listIterator();
        ListIterator<E> it2 = list2.listIterator();

        while (it1.hasNext() && it2.hasNext()) {
            E e1 = it1.next();
            E e2 = it2.next();
            if (!(e1 == null ? e2 == null : e1.equals(e2))) {
                return false;
            }
        }
        return true;
    }
}
