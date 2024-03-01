package latihan_tanggal_01_maret_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rekursif2 {
    public static int kemunculanAngsa(int n){
        if(n == 0){
            return 0;
        }else{
            return 2 + kemunculanAngsa(n-1);
        }
    }
    public static void main(String[]args) throws NumberFormatException, IOException{
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.print("Masukan n :");
        n = Integer.parseInt(buff.readLine());
        System.out.println("maka outputnya adalah : " + kemunculanAngsa(n));
    }
}
