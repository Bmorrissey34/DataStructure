import java.util.Arrays;

public class SortingAlg {
    public static <T extends Comparable<? super T>> void mergeSort(T[] A) {
        if (A.length < 2) return;

        int mid = A.length / 2;
        T[] left = Arrays.copyOfRange(A, 0, mid);
        T[] right = Arrays.copyOfRange(A, mid, A.length);

        mergeSort(left);
        mergeSort(right);

        merge(A, left, right);
    }

    private static <T extends Comparable<? super T>> void merge(T[] A, T[] left, T[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                A[k++] = left[i++];
            } else {
                A[k++] = right[j++];
            }
        }
        while (i < left.length) {
            A[k++] = left[i++];
        }
        while (j < right.length) {
            A[k++] = right[j++];
        }
    }
}
