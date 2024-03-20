import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihan1 {
    private String[] namaMahasiswa;
    private String[] npmMahasiswa;
    private double[] nilaiKuis;
    private double[] nilaiSoftSkill;
    private double[] nilaiTugas;
    private double[] nilaiUTS;
    private double[] nilaiUAS;

    public latihan1(int jumlahMahasiswa) {
        namaMahasiswa = new String[jumlahMahasiswa];
        npmMahasiswa = new String[jumlahMahasiswa];
        nilaiKuis = new double[jumlahMahasiswa];
        nilaiSoftSkill = new double[jumlahMahasiswa];
        nilaiTugas = new double[jumlahMahasiswa];
        nilaiUTS = new double[jumlahMahasiswa];
        nilaiUAS = new double[jumlahMahasiswa];
    }

    public void inputDataMahasiswa(int index, String nama, String npm, double kuis, double softskill, double tugas,
            double uts, double uas) {
        namaMahasiswa[index] = nama;
        npmMahasiswa[index] = npm;
        nilaiKuis[index] = kuis;
        nilaiSoftSkill[index] = softskill;
        nilaiTugas[index] = tugas;
        nilaiUTS[index] = uts;
        nilaiUAS[index] = uas;
    }

    public void hitungNilaiAkhir() {
        for (int i = 0; i < namaMahasiswa.length; i++) {
            double nilaiAkhir = nilaiKuis[i] * 0.10 + nilaiSoftSkill[i] * 0.10 + nilaiTugas[i] * 0.20
                    + nilaiUTS[i] * 0.30 + nilaiUAS[i] * 0.30;
            String nilaiHuruf = tentukanNilaiHuruf(nilaiAkhir);
            System.out.println("Nama\t\t: " + namaMahasiswa[i]);
            System.out.println("NPM\t\t: " + npmMahasiswa[i]);
            System.out.println("Nilai Akhir\t: " + nilaiAkhir);
            System.out.println("Nilai Huruf\t: " + nilaiHuruf);
            System.out.println();
        }
    }

    public void cariMahasiswa(String cari) {
        boolean ditemukan = false;
        for (int i = 0; i < npmMahasiswa.length; i++) {
            if (npmMahasiswa[i].equals(cari) || namaMahasiswa[i].equalsIgnoreCase(cari)) {
                System.out.println("Data ditemukan!");
                System.out.println("Nama\t\t: " + namaMahasiswa[i]);
                System.out.println("NPM\t\t: " + npmMahasiswa[i]);
                System.out.println("Nilai Akhir\t: " + (nilaiKuis[i] * 0.10 + nilaiSoftSkill[i] * 0.10
                        + nilaiTugas[i] * 0.20 + nilaiUTS[i] * 0.30 + nilaiUAS[i] * 0.30));
                System.out.println("Nilai Huruf\t: " + tentukanNilaiHuruf(nilaiKuis[i] * 0.10 + nilaiSoftSkill[i] * 0.10
                        + nilaiTugas[i] * 0.20 + nilaiUTS[i] * 0.30 + nilaiUAS[i] * 0.30));
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Data tidak ditemukan!");
        }
    }

    public String tentukanNilaiHuruf(double nilai) {
        if (nilai >= 80)
            return "A";
        else if (nilai >= 68)
            return "B";
        else if (nilai >= 56)
            return "C";
        else if (nilai >= 45)
            return "D";
        else
            return "E";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = Integer.parseInt(buff.readLine());

        latihan1 sistemNilai = new latihan1(jumlahMahasiswa);

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = buff.readLine();
            System.out.print("NPM: ");
            String npm = buff.readLine();
            System.out.print("Nilai Kuis: ");
            double kuis = Double.parseDouble(buff.readLine());
            System.out.print("Nilai Soft Skill: ");
            double softskill = Double.parseDouble(buff.readLine());
            System.out.print("Nilai Tugas: ");
            double tugas = Double.parseDouble(buff.readLine());
            System.out.print("Nilai UTS: ");
            double uts = Double.parseDouble(buff.readLine());
            System.out.print("Nilai UAS: ");
            double uas = Double.parseDouble(buff.readLine());

            sistemNilai.inputDataMahasiswa(i, nama, npm, kuis, softskill, tugas, uts, uas);
        }

        System.out.println("\nDaftar Nilai Mahasiswa:");
        sistemNilai.hitungNilaiAkhir();

        System.out.print("\nCari (Nama/NPM): ");
        String cari = buff.readLine();
        sistemNilai.cariMahasiswa(cari);

    }
}
