package latihan_tanggal_01_maret_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rekursif3 {
    public static int soal3(int n){
        if(n == 0){
            return 0;
        }else{
            if(n % 10 == 0){
                return n++;
            }else{
                return (n % 10) + soal3(n/10);
            }
        }
    }
    public static void main(String[]args) throws NumberFormatException, IOException{
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.print("Masukkan n : ");
        n = Integer.parseInt(buff.readLine());
        System.out.println("Maka Outputnya : " + soal3(n));
    }
}
