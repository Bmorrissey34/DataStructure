import java.util.Comparator;

public class SortingComp {
    public static <T> void quickSort(T[] A, Comparator<T> cmp) {
        quickSort(A, 0, A.length - 1, cmp);
    }

    private static <T> void quickSort(T[] A, int low, int high, Comparator<T> cmp) {
        if (low < high) {
            int pi = partition(A, low, high, cmp);
            quickSort(A, low, pi - 1, cmp);
            quickSort(A, pi + 1, high, cmp);
        }
    }

    private static <T> int partition(T[] A, int low, int high, Comparator<T> cmp) {
        T pivot = A[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (cmp.compare(A[j], pivot) < 0) {
                i++;
                T temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        T temp = A[i + 1];
        A[i + 1] = A[high];
        A[high] = temp;
        return i + 1;
    }
}
