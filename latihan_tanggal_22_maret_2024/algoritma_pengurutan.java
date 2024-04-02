import java.util.Arrays;

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
        for (int i = n - 1; i > 0; i--) { // descending for(int i =0 ; i < n-1 ; i--)
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

    // Ascending Minimum
    public void selection_Min(AnyType[] array, int n) {
        for (int i = 0; i < n - 1; i++) { // descending : for(int i = n-1 ; i>0 ;i--)
            int index_min = i;
            // mencari elemen min
            for (int j = i + 1; j < n; j++) {
                if (array[j].compareTo(array[index_min]) < 0) {
                    index_min = j;
                }
            }
            // proses pertukaran
            AnyType temp = array[index_min];
            array[index_min] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        algoritma_pengurutan<Integer> asd = new algoritma_pengurutan<>(); /// untuk generic paramater pada method
        //algoritma_pengurutan<> asd = new algoritma_pengurutan<>(); // untuk variabel int paramater pada method

        Integer[] array1 = { 34, 64, 90, 11, 25, 12, 22 };
        System.out.println("Data belum urut : ");
        System.out.println(Arrays.toString(array1));

        asd.bubbleSort(array1, array1.length);
        System.out.println("Data sudah terurut : ");
        System.out.println(Arrays.toString(array1));
        
        // asd.selection_Min(array1, array1.length);
        // System.out.println("Data terurut secara minimum : ");
        // System.out.println(Arrays.toString(array1));

        // asd.selection_Maks(array1, array1.length);
        // System.out.println("Data terurut secara maksimum : ");
        // System.out.println(Arrays.toString(array1));
        
        System.out.println();
      // tambahkan pemanggilan method selection_maks dan selection_min

      algoritma_pengurutan<Integer>sku = new algoritma_pengurutan<>();
      int[] arrays2 = {2,4,19,8,1};
      System.out.println("Data belum urut : ");
      System.out.println(Arrays.toString(arrays2));

      sku.bubbleSort_1(arrays2, arrays2.length);
      System.out.println("Data sudah terurut : ");
      System.out.println(Arrays.toString(arrays2));
    }
}