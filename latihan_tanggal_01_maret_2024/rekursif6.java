package latihan_tanggal_01_maret_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rekursif6 {
    private static int soal6(String huruf, int angka1, int angka2) {
        if (angka1 >= huruf.length() - 1) {
            return angka2;
        } else {
            if (huruf.substring(angka1, angka1 + 2).equalsIgnoreCase("22")) {
                angka2++;
                return soal6(huruf, angka1 + 2, angka2);
            } else {
                return soal6(huruf, angka1 + 1, angka2);
            }
        }
    }

    public static int soal6(String huruf) {
        return soal6(huruf, 0, 0);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String kata;
        System.out.print("Masukan Kata : ");
        kata = buff.readLine();
        System.out.println("Maka outputnya : " + soal6(kata, 0, 0));
    }
}
