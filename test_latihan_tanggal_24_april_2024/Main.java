import java.util.*;

class Guru {
    private String kode;
    private String nama;
    private String pendidikan;
    private int tahunMasuk;
    private int jumlahHariKerja;

    public Guru(String kode, String nama, String pendidikan, int tahunMasuk, int jumlahHariKerja) {
        this.kode = kode;
        this.nama = nama;
        this.pendidikan = pendidikan;
        this.tahunMasuk = tahunMasuk;
        this.jumlahHariKerja = jumlahHariKerja;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public int getJumlahHariKerja() {
        return jumlahHariKerja;
    }

    public int hitungMasaKerja(int tahunSekarang) {
        return tahunSekarang - tahunMasuk;
    }

    public double hitungGajiPokok() {
        if (pendidikan.equals("S1")) {
            return 3000000;
        } else if (pendidikan.equals("S2")) {
            return 3750000;
        } else {
            return 0;
        }
    }

    public double hitungTunjangan(int tahunSekarang) {
        int masaKerja = hitungMasaKerja(tahunSekarang);
        if (masaKerja < 5) {
            return 1000000;
        } else if (masaKerja >= 5 && masaKerja < 10) {
            return 1500000;
        } else {
            return 2000000;
        }
    }

    public double hitungGajiTotal(int tahunSekarang) {
        double gajiPokok = hitungGajiPokok();
        double tunjangan = hitungTunjangan(tahunSekarang);
        return gajiPokok + tunjangan;
    }

    public double hitungGajiHonorer() {
        return 2000000 + (jumlahHariKerja * 45000);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Guru> daftarGuru = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Input daftar guru
        System.out.println("Masukkan jumlah guru:");
        int jumlahGuru = scanner.nextInt();
        scanner.nextLine(); // Membuang newline
        for (int i = 0; i < jumlahGuru; i++) {
            System.out.println("Masukkan data guru ke-" + (i + 1) + ":");
            System.out.print("Kode Guru: ");
            String kode = scanner.nextLine();
            System.out.print("Nama Guru: ");
            String nama = scanner.nextLine();
            System.out.print("Pendidikan (S1/S2): ");
            String pendidikan = scanner.nextLine();
            System.out.print("Tahun Masuk: ");
            int tahunMasuk = scanner.nextInt();
            System.out.print("Jumlah Hari Kerja: ");
            int jumlahHariKerja = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            daftarGuru.add(new Guru(kode, nama, pendidikan, tahunMasuk, jumlahHariKerja));
        }

        // Sorting berdasarkan total gaji
        Collections.sort(daftarGuru, new Comparator<Guru>() {
            @Override
            public int compare(Guru guru1, Guru guru2) {
                double gajiTotal1 = guru1.hitungGajiTotal(2024);
                double gajiTotal2 = guru2.hitungGajiTotal(2024);
                return Double.compare(gajiTotal2, gajiTotal1);
            }
        });

        // Output daftar guru
        System.out.println("\nDaftar Guru (berdasarkan total gaji):");
        for (Guru guru : daftarGuru) {
            System.out.println("Kode: " + guru.getKode() + ", Nama: " + guru.getNama() +
                    ", Total Gaji: Rp" + guru.hitungGajiTotal(2024));
        }

        // Pencarian berdasarkan nama guru
        System.out.print("\nMasukkan nama guru yang ingin dicari: ");
        String namaCari = scanner.nextLine();
        boolean ditemukan = false;
        for (Guru guru : daftarGuru) {
            if (guru.getNama().equalsIgnoreCase(namaCari)) {
                System.out.println("Guru dengan nama " + namaCari + " ditemukan.");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Guru dengan nama " + namaCari + " tidak ditemukan.");
        }
    }
}
