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
        algoritma_pengurutan asd = new algoritma_pengurutan();
        int[] array = { 64, 34, 25, 12, 22, 11, 90 };
        int n = array.length;
        asd.bubbleSort_1(array, n);
        System.out.println("data terurut:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        Comparable[] array1 = {2,5,6,1,-1};
        asd.bubbleSort(array1, n);
        System.out.println("data terurut :");
    
    }
}