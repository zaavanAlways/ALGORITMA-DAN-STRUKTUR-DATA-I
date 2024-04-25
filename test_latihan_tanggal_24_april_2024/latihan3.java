import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Transaksi {
    String kode;
    int jumlahBeli, harga;

    public Transaksi(String kode, int jumlahBeli, int harga) {
        this.kode = kode;
        this.jumlahBeli = jumlahBeli;
        this.harga = harga;
    }

    public int getTotalHarga() {
        return jumlahBeli * harga;
    }

    public double getPajak() {
        return 0.11 * getTotalHarga();
    }

    public double getTotalBayar() {
        return getTotalHarga() + getPajak();
    }
}

public class latihan3 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan banyak transaksi : ");
        int data = Integer.parseInt(buff.readLine());
        Transaksi[] asd = new Transaksi[data];
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < data; i++) {
            System.out.println();
            System.out.println("Data Ke - " + (i + 1));
            System.out.print("Masukkan kode Trx : ");
            String kode = buff.readLine();
            System.out.print("Masukkan jumlah beli : ");
            int jumlahBeli = Integer.parseInt(buff.readLine());
            System.out.print("Masukkan Harga : Rp");
            int harga = Integer.parseInt(buff.readLine());
            asd[i] = new Transaksi(kode, jumlahBeli, harga);
            System.out.println("Total Harga : Rp" + asd[i].getTotalHarga());
            System.out.println("Pajak 11 % : Rp" + asd[i].getPajak());
            System.out.println("Total Bayar : Rp" + asd[i].getTotalBayar());
        }
        Arrays.sort(asd, (t1, t2) -> Double.compare(t1.getTotalBayar(), t2.getTotalBayar()));

        System.out.println("Kd Trx\tJumlah Beli\tHarga Satuan\tPajak\t\tTotal Bayar");
        System.out.println("-----------------------------------------------------------------");
        for (Transaksi transaksi : asd) {
            System.out.printf("%s\t%d\t\tRp%d\t\tRp%.0f\tRp%.0f%n",
                    transaksi.kode, transaksi.jumlahBeli, transaksi.harga,
                    transaksi.getPajak(), transaksi.getTotalBayar());
        }

        System.out.println("-----------------------------------------------------------------");

        System.out.print("Masukkan Kode Trx yang dicari: ");
        String cariKode = buff.readLine();
        boolean found = false;
        for (Transaksi transaksi : asd) {
            if (transaksi.kode.equalsIgnoreCase(cariKode)) {
                found = true;
                break;
            }
        }
        System.out.println("Hasil Pencarian: " + found);

    }
}
