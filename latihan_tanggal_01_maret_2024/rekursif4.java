package latihan_tanggal_01_maret_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rekursif4 {
    public static int kemunculanX(String x){
        if(x.length() == 0){
            return 0;
        }else{
            if(x.charAt(0) == 'x'){
                return 1 + kemunculanX(x.substring(1));
            }else{
                return kemunculanX(x.substring(1));
            }
        }
        
    }
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader buff = new BufferedReader (new InputStreamReader(System.in));
        String x; 
        System.out.print("masukkan x : ");
        x = buff.readLine();
        System.out.println("Maka Outputnya : " + kemunculanX(x));
    }
}
