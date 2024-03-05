package latihan_tanggal_05_maret_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class divide_dan_conquer1 {
    static BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int A[];
    static int size;

    public static void minMax(int i, int j) { // i dan j adalah index
        int max1, min1, mid;
        if (i == j) {
            max = min = A[i];
        } else { // i != j
            if (i == j - 1) { // hanya ada 2 elemen
                if (A[i] < A[j]) {
                    max = A[j];
                    min = A[i];
                } else {
                    max = A[i];
                    min = A[j];
                }
            } else { // lebih dari 2 elemen(divide size)
                mid = (i + j) / 2;
                minMax(i, mid); // recursive call

                max1 = max;
                min1 = min;
                minMax(mid + 1, j); // recursive call
                if (max < max1)
                    max = max1; // update nilai max
                if (min > min1)
                    min = min1; // update nilai min;
            }
        }
    }

    public static void inputArray() throws NumberFormatException, IOException {
        for (int i = 0; i < size; i++) {
            A[i] = Integer.parseInt(buff.readLine());
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.print(" Masukkan size array :");
        size = Integer.parseInt(buff.readLine());
        A = new int[size];
        inputArray();
        minMax(0, size - 1);
        System.out.printf("Nilai min = %d dan nilai max = %d", min, max);
    }
}