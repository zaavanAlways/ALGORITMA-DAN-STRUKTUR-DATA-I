import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class latihan2 {
    public static void bubbleSort_Ascending(Double[] array, int n) {
        Double temp;
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

    public static void insertionSort_Descending(Double data[], int n) {
        Double temp;
        for (int i = 1; i < n; i++) {
            temp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] < temp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
    }

    public static int linearSearch(Double[] arr, double key) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan banyak mahasiswa : ");
        int banyakmhs = Integer.parseInt(buff.readLine());
        Double ipk[] = new Double[banyakmhs];
        for (int i = 0; i < banyakmhs; i++) {
            System.out.print("Masukkan IPK Mahasiswa ke -" + (i + 1) + " = ");
            ipk[i] = Double.parseDouble(buff.readLine());
        }
        bubbleSort_Ascending(ipk, banyakmhs);
        System.out.println("Data diurutkan secara ascending : " + Arrays.toString(ipk));
        insertionSort_Descending(ipk, banyakmhs);
        System.out.println("Data diurutkan secara descending ; " + Arrays.toString(ipk));
        // Input IPK yang dicari
        System.out.print("Masukkan IPK yang ingin dicari: ");
        double cari = Double.parseDouble(buff.readLine());

        int index = linearSearch(ipk, cari);
        if (index != -1) {
            System.out.println("\n\nIPK " + cari + " ditemukan pada indeks: " + index);
        } else {
            System.out.println("\n\nIPK " + cari + " tidak ditemukan.");
        }

        // Perulangan program
        char choice;
        do {
            System.out.print("\nApakah Anda Ingin Mengulang Program (Y/T): ");
            choice = buff.readLine().trim().toUpperCase().charAt(0);
        } while (choice == 'Y');

    }
}
