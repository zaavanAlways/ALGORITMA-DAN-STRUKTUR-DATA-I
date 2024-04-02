import java.util.Arrays;

public class algoritma_pengurutan_generic_method<T extends Comparable<? super T>> {
    public static void main(String[] args) {
        algoritma_pengurutan_generic_method<Integer> asd = new algoritma_pengurutan_generic_method<>();
        Integer[] data = { -2, 45, 0, 11, -9 };
        System.out.print("Data Belum Terurut : " + Arrays.toString(data));
        System.out.println();
        asd.bubbleSort_Ascending(data);
        System.out.print("Data Terurut secara Ascending : " + Arrays.toString(data));
        System.out.println();
        asd.bubbleSort_Descending(data);
        System.out.print("Data Terurut Secara Descending : " + Arrays.toString(data));

    }

    public void bubbleSort_Ascending(T[] array) {
        int n = array.length;
        for (int i = n - 1; i > 0; i--) {
            int lastModifiedIndex = 0;
            for (int currentIndex = 1; currentIndex < n; currentIndex++) {
                if (array[currentIndex - 1].compareTo(array[currentIndex]) > 0) {
                    T temp = array[currentIndex - 1];
                    array[currentIndex - 1] = array[currentIndex];
                    array[currentIndex] = temp;
                    lastModifiedIndex = currentIndex;
                }
            }
            n = lastModifiedIndex;
        }
    }

    public void bubbleSort_Descending(T[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i--) {
            int lastModifiedIndex = 0;
            for (int currentIndex = 1; currentIndex < n; currentIndex++) {
                if (array[currentIndex - 1].compareTo(array[currentIndex]) < 0) {
                    T temp = array[currentIndex - 1];
                    array[currentIndex - 1] = array[currentIndex];
                    array[currentIndex] = temp;
                    lastModifiedIndex = currentIndex;
                }
            }
            n = lastModifiedIndex;
        }
    }
}
