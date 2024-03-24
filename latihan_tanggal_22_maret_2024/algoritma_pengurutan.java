public class algoritma_pengurutan<T extends Comparable<? super T>> {

    public void bubbleSort(T[] array, int n) {
        T temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void bubbleSort_1(int[] array, int n) {
        int temp;
        for (int i = 0; i < n - 1; i++) { // langkah
            for (int j = 0; j < n - i - 1; i++) { // sub-langkah
                if (array[j] > array[j + 1]) {
                    // proses pertukaran elemen
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        algoritma_pengurutan<Integer> asd = new algoritma_pengurutan<>();

        int[] array1 = { 34, 64, 90, 11, 25, 12, 22 };
        asd.bubbleSort_1(array1, array1.length);
        System.out.println("Data belum urut : ");
        System.out.println("34,64,90,11,25,12,22");
        System.out.println("Data Terurut : ");
        for (int i : array1) {
            System.out.print(i + " ");
        }

    }
}