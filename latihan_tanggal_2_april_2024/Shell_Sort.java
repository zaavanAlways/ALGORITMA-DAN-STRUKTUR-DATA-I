package latihan_tanggal_2_april_2024;

import java.util.Arrays;

public class Shell_Sort {
    public static void shellSort_Ascending(int[] data, int n) {
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int temp = data[i];
                int j;
                for (j = i; j >= gap && data[j - gap] > temp; j -= gap) {
                    data[j] = data[j - gap];
                }
                data[j] = temp;
            }
        }
    }

    public static void shellSort_Descending(int[] data, int n) {
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int temp = data[i];
                int j;
                for (j = i; j >= gap && data[j - gap] < temp; j -= gap) {
                    data[j] = data[j - gap];
                }
                data[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 9, 8, 3, 7, 5, 6, 4, 1 };
        System.out.print("Data Belum Terurut : " + Arrays.toString(array));
        System.out.println();
        shellSort_Ascending(array, array.length);
        System.out.print("Data Terurut Secara Ascending : " + Arrays.toString(array));
        System.out.println();
        shellSort_Descending(array, array.length);
        System.out.print("Data Terurut Secara Descending : " + Arrays.toString(array));
    }
}
