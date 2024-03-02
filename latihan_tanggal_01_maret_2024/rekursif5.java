package latihan_tanggal_01_maret_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rekursif5 {
    public static String soal5(String huruf) {
        if (huruf.length() <= 1) {
            return huruf;
        } else {
            if (huruf.charAt(0) == 'a') {
                return soal5(huruf.substring(1)) + 'a';
            } else {
                return huruf.charAt(0) + soal5(huruf.substring(1));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String huruf;
        System.out.print("Masukkan Kata : ");
        huruf = buff.readLine();
        System.out.println("Maka Outputnya : " + soal5(huruf));
    }
}
