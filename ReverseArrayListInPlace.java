import java.util.ArrayList;

public class ReverseArrayListInPlace {
    public static <E> void reverseArrayListInPlace(ArrayList<E> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            E temp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, temp);
        }
    }
}
