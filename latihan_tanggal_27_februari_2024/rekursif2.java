package latihan_tanggal_27_februari_2024;

public class rekursif2 {
    public static int faktorial_rekursif(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 2 + faktorial_rekursif(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 0;
        System.out.println("n = 0 maka output adalah " + faktorial_rekursif(n));

    }
}
