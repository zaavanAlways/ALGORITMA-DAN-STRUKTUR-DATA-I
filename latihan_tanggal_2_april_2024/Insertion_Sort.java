package latihan_tanggal_2_april_2024;

import java.util.Arrays;

public class Insertion_Sort {

    public static void insertionSort_Ascending(int data[], int n) {
        int j, temp;
        for (int i = 1; i < n; i++) {
            temp = data[i];
            j = i - 1;
            while (j >= 0 && data[j] > temp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
    }

    public static void insertionSort_Descending(int data[], int n) {
        int j, temp;
        for (int i = 1; i < n; i++) {
            temp = data[i];
            j = i - 1;
            while (j >= 0 && data[j] < temp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int data[] = { 26, 54, 93, 17, 77, 31, 44, 55, 20 };
        System.out.print("Data Belum Terurut  :" + Arrays.toString(data));
        System.out.println();
        insertionSort_Ascending(data, data.length);
        System.out.println("Data Terurut Secara Ascending : " + Arrays.toString(data));
        System.out.println();
        insertionSort_Descending(data, data.length);
        System.out.println("Data Terurut Secara Descending : " + Arrays.toString(data));

    }
}
