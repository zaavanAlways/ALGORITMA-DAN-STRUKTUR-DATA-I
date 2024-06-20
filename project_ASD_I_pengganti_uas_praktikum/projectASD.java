package project_ASD_I_pengganti_uas_praktikum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Antrian {
    long[] data = new long[100];
    int head;
    int tail;
}

public class projectASD {
    static Antrian antrian = new Antrian();
    static BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
        menu();
    }

    public static void Create() {
        antrian.head = antrian.tail = -1;
    }

    public static boolean IsEmpty() {
        return antrian.tail == -1;
    }

    public static boolean IsFull() {
        return antrian.tail == antrian.data.length - 1;
    }

    public static void Enqueue(long data) {
        if (IsEmpty()) {
            antrian.head = antrian.tail = 0;
            antrian.data[antrian.tail] = data;
        } else if (!IsFull()) {
            antrian.tail++;
            antrian.data[antrian.tail] = data;
        }
        sortQueue();
    }

    public static long Dequeue() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong!");
            return -1;
        }

        long e = antrian.data[antrian.head];
        for (int i = antrian.head; i < antrian.tail; i++) {
            antrian.data[i] = antrian.data[i + 1];
        }
        antrian.tail--;

        if (antrian.tail == -1) {
            antrian.head = -1;
        }

        return e;
    }

    // mengurutkan data berdasarkan npm dengan cara ascending
    public static void sortQueue() {
        for (int i = antrian.head; i < antrian.tail; i++) {
            for (int j = antrian.head; j < antrian.tail - (i - antrian.head); j++) {
                if (antrian.data[j] > antrian.data[j + 1]) {
                    long temp = antrian.data[j];
                    antrian.data[j] = antrian.data[j + 1];
                    antrian.data[j + 1] = temp;
                }
            }
        }
    }

    public static void admin() throws NumberFormatException, IOException {
        long input;
        int pilih;
        Create();
        do {
            System.out.println("|============================================================|");
            System.out.println("|                         Menu admin                         |");
            System.out.println("|============================================================|");
            System.out.println("|       tekan (1) untuk memasukkan NISN                      |");
            System.out.println("|       tekan (2) menghapus data                             |");
            System.out.println("|       tekan (3) melihat data antrian                       |");
            System.out.println("|       tekan (4) keluar                                     |");
            System.out.println("|============================================================|");
            System.out.print("pilih : ");
            pilih = Integer.parseInt(buff.readLine());

            switch (pilih) {
                case 1:
                    if (IsFull()) {
                        System.out.println("Antrian Penuh !");
                    } else {
                        System.out.print("Data yang dimasukkan : ");
                        input = Long.parseLong(buff.readLine());
                        Enqueue(input);
                    }
                    break;

                case 2:
                    if (IsEmpty()) {
                        System.out.println("Antrian kosong !");
                    } else {
                        System.out.println("Data yang dikeluarkan : " + Dequeue());
                    }
                    break;

                case 3:
                    if (IsEmpty()) {
                        System.out.println("Antrian Kosong !");
                    } else {
                        System.out.println("Data yang terinput : ");
                        for (int i = antrian.head; i <= antrian.tail; i++) {
                            System.out.println((i + 1) + ". " + antrian.data[i]);
                        }
                    }
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Tidak ada dalam pilihan");
            }
        } while (pilih >= 1 && pilih <= 4);
    }

    public static void menu() throws NumberFormatException, IOException {
        int pil;
        do {
            System.out.println("|=============================================================|");
            System.out.println("|                       Vaksinasi Siswa/Siswi                 |");
            System.out.println("|                        SDN 185 Palembang                    |");
            System.out.println("|=============================================================|");
            System.out.println("| 1. Masuk ke menu pendaftaran (press 1)                      |");
            System.out.println("| 2. Keluar  (press 2)                                        |");
            System.out.println("|=============================================================|");
            System.out.print("Masukkan pilihan : ");
            pil = Integer.parseInt(buff.readLine());

            switch (pil) {
                case 1:
                    admin();
                    break;
                case 2:
                    System.out.println("Terima Kasih Telah Menggunakan Program Ini !!!!!");
                    return; // keluar dari method menu dan program berakhir
                default:
                    System.out.println("Tidak tersedia dalam menu");
                    break;
            }
        } while (pil != 2);
    }
}
