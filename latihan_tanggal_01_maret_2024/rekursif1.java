package latihan_tanggal_01_maret_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rekursif1 {
    public static int soal_1(int angka){
        if(angka == 0){
            return 0;
        }else{
            if(angka % 10 == 9){
                return 1 + soal_1(angka/10);
            }else{
                return soal_1(angka/10);
            }
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int angka;
        System.out.print("Masukkan angka : ");
        angka = Integer.parseInt(buff.readLine());
        System.out.println("Maka Outputnya : " + soal_1(angka));
    }
}