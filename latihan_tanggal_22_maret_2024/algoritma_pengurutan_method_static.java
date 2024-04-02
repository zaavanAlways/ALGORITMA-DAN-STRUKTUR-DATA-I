import java.util.Arrays;

public class algoritma_pengurutan_method_static {

    public static void bubbleSort_Ascending(int array[], int n) {
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSort_Descending(int array[], int n) {
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] data = { -2, 45, 0, 11, -9 };
        System.out.print("Data Belum terurut : " + Arrays.toString(data));
        System.out.println();
        bubbleSort_Ascending(data, data.length);
        System.out.print("Data Terurut secara Ascending : " + Arrays.toString(data));
        System.out.println();
        bubbleSort_Descending(data, data.length);
        System.out.print("Data Terurut secara descending : " + Arrays.toString(data));
    }
}