package latihan_tanggal_01_maret_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rekursif7 {
    public static String soal7(String karakter) {
        if (karakter.isEmpty()) {
            return " ";
        } else {
            if (karakter.charAt(0) == 'z') {
                return soal7(karakter.substring(1));
            } else {
                return karakter.charAt(0) + soal7(karakter.substring(1));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String karakter;
        System.out.print("Masukkan karakter : ");
        karakter = buff.readLine();
        System.out.println("Maka outputnya : " + soal7(karakter));
    }
}
