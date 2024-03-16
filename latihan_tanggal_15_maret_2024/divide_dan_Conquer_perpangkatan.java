package latihan_tanggal_15_maret_2024;

public class divide_dan_Conquer_perpangkatan {
    public static int pangkat(int a, int n) {
        if (n == 0)// Kasus Dasar
        {
            return 1;
        } else // kasus induksi
               // devide,coquer,dan combine
        {
            if (n % 2 == 1) {
                return pangkat(a, n / 2) * pangkat(a, n / 2) * a; // Kasus Ganjil
            } else {
                return pangkat(a, n / 2) * pangkat(a, n / 2); // Kasus Genap
            }
        }
    }

    public static void main(String[] args) {
        int a = 3;
        int n = 16;
        System.out.println(a + " ^ " + n + " = " + pangkat(a, n));

    }

}
