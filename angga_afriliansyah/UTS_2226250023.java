package angga_afriliansyah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UTS_2226250023 {

    public static int getTotalHargaAngga(int hargaBeliAngga, int jumlahBeliAngga) {
        return hargaBeliAngga * jumlahBeliAngga;
    }

    public double getDiskonBelanjaAngga(int totalBelanjaanAngga) {
        if (totalBelanjaanAngga > 1000000) {
            return 0.15;
        } else {
            return 0;
        }
    }

    public String getKodeMemer(String namaMemberAngga) {
        if (namaMemberAngga.equalsIgnoreCase("Khatulistiwa")) {
            return "MBL-01";
        } else if (namaMemberAngga.equalsIgnoreCase("Rani")) {
            return "MBL-02";
        } else if (namaMemberAngga.equalsIgnoreCase("Sunny")) {
            return "MBL-03";
        } else if (namaMemberAngga.equalsIgnoreCase("Bulan")) {
            return "MBL-04";
        } else {
            return null;
        }
    }

    public double getPajakAngga(int totalBelanjaanAngga, double diskon) {
        return 0.5 * (totalBelanjaanAngga - diskon);
    }

    public String getPoinBelanjan(int totalBelanjaanAngga) {
        if (totalBelanjaanAngga < 1000000) {
            return "5 POin";
        } else {
            return null;
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String kodeBarangAngga[] = new String[100];
        int hargaBarangAngga[] = new int[100];
        int jumlahBeliAngga[] = new int[100];
        String kodeMemberAngga;
        String daftarMemberAngga;
        int totalHargaAngga[] = new int[100];
        int i = 0;
        System.out.println(
                "-------------------------------Toko Bumi dan Langit-------------------------------------");
        do {
            System.out.println();
            System.out.print("Masukkan Kode Barang : ");
            kodeBarangAngga[i] = buff.readLine();
            System.out.println();
            if (!kodeBarangAngga[i].equals("-")) {
                System.out.println();
                System.out.print("Masukkan Kode Barang : ");
                kodeBarangAngga[i] = buff.readLine();
                System.out.print("Masukkan Harga Barang : " + "Rp.");
                hargaBarangAngga[i] = Integer.parseInt(buff.readLine());
                System.out.print("Masukkan Jumlah Beli : ");
                jumlahBeliAngga[i] = Integer.parseInt(buff.readLine());
                System.out.println();
                totalHargaAngga[i] = getTotalHargaAngga(hargaBarangAngga[i], jumlahBeliAngga[i]);
            }
        } while (!kodeBarangAngga[i].equals("-"));

        if (!kodeBarangAngga[0].equals("-")) {
            System.out.print("Apakah mempunyai member : <Ya/Tidak> : ");
            kodeMemberAngga = buff.readLine();
            if (kodeMemberAngga.equalsIgnoreCase("Ya")) {
                do {
                    System.out.print("Masukkan Kode Member : ");
                    kodeMemberAngga = buff.readLine();
                } while (kodeMemberAngga.length() != 10);
            } else if (kodeMemberAngga.equalsIgnoreCase("Tidak")) {
                do {
                    System.out.print("Apakah ingin mendaftar? <Ya/Tidak> : ");
                    daftarMemberAngga = buff.readLine();
                    System.out.print("Masukkan nama member : ");

                } while (kodeMemberAngga.length() != 10);
            }
        }
    }
}
