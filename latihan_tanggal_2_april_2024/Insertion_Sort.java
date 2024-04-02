package latihan_tanggal_2_april_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan Banyak array : ");
        int data = Integer.parseInt(buff.readLine());
        insertionSort_Ascending(null, data);
    }
}
