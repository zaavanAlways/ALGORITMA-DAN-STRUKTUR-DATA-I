import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Guru implements Comparable<Guru> {
    private String kode;
    private String nama;
    private String pendidikan;
    private int tahunMasuk;
    private int masaKerja;
    private int gajiPokok;
    private int tunjangan;
    private int totalGaji;

    public Guru(String kode, String nama, String pendidikan, int tahunMasuk) {
        this.kode = kode;
        this.nama = nama;
        this.pendidikan = pendidikan;
        this.tahunMasuk = tahunMasuk;
        this.masaKerja = java.time.LocalDate.now().getYear() - tahunMasuk;
        this.gajiPokok = hitungGajiPokok();
        this.tunjangan = hitungTunjangan();
        this.totalGaji = hitungTotalGaji();
    }

    private int hitungGajiPokok() {
        if (pendidikan.equals("S1")) {
            return 3000000;
        } else if (pendidikan.equals("S2")) {
            return 3750000;
        } else {
            return 0;
        }
    }

    private int hitungTunjangan() {
        if (masaKerja < 5) {
            return 1000000;
        } else if (masaKerja >= 5 && masaKerja < 10) {
            return 1500000;
        } else {
            return 2000000;
        }
    }

    private int hitungTotalGaji() {
        return gajiPokok + tunjangan;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public String toString() {
        return "Kode: " + kode + ", Nama: " + nama + ", Total Gaji: Rp" + totalGaji;
    }

    public int compareTo(Guru guru) {
        return guru.totalGaji - this.totalGaji;
    }
}

public class latihan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Guru> guruList = new ArrayList<>();

        // Input data guru
        System.out.println("Masukkan jumlah guru: ");
        int jumlahGuru = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < jumlahGuru; i++) {
            System.out.println("Masukkan kode guru: ");
            String kode = scanner.nextLine();
            while (!isValidKode(kode)) {
                System.out.println("Kode guru tidak valid, masukkan kembali: ");
                kode = scanner.nextLine();
            }

            System.out.println("Masukkan nama guru: ");
            String nama = scanner.nextLine();

            System.out.println("Masukkan pendidikan (S1/S2): ");
            String pendidikan = scanner.nextLine();

            System.out.println("Masukkan tahun masuk guru: ");
            int tahunMasuk = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            Guru guru = new Guru(kode, nama, pendidikan, tahunMasuk);
            guruList.add(guru);
        }

        // Urutkan guru berdasarkan total gaji secara descending
        Collections.sort(guruList);

        // Tampilkan daftar guru beserta total gaji secara descending
        System.out.println("\nDaftar Guru (berdasarkan total gaji secara descending):");
        for (Guru guru : guruList) {
            System.out.println(guru);
        }

        // Pencarian guru berdasarkan nama
        System.out.println("\nMasukkan nama guru yang ingin dicari: ");
        String namaCari = scanner.nextLine();
        cariGuru(namaCari, guruList);

        scanner.close();
    }

    private static boolean isValidKode(String kode) {
        if (kode.length() != 6 || !kode.startsWith("GT")) {
            return false;
        }

        int tahunMasuk;
        try {
            tahunMasuk = Integer.parseInt(kode.substring(2, 4));
        } catch (NumberFormatException e) {
            return false;
        }

        return tahunMasuk <= java.time.LocalDate.now().getYear();
    }

    private static void cariGuru(String nama, ArrayList<Guru> guruList) {
        boolean found = false;
        for (Guru guru : guruList) {
            if (guru.getNama().equalsIgnoreCase(nama)) {
                System.out.println("Guru ditemukan: " + guru);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Guru tidak ditemukan.");
        }
    }
}
