public class algoritma_pengurutan<AnyType extends Comparable<? super AnyType>> {

    public void bubbleSort(AnyType[] array, int n) {
        AnyType temp;
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

    // Ascending Maksimum
    public void selection_Maks(AnyType[] array, int n) {
        for (int i = n - 1; i > 0; i--) { // descending for(int i =0 ; i > n-1 ; i--)
            int index_maks = 0;
            // mencari elemen maks
            for (int j = 1; j < i + 1; j++) {
                if (array[j].compareTo(array[index_maks]) > 0) {
                    index_maks = j;
                }
            }
            // proses pertukaran
            AnyType temp = array[index_maks];
            array[index_maks] = array[i];
            array[i] = temp;
        }
    }

    //Ascending Minimum
    public void selection_Min(AnyType[] array, int n){
        
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