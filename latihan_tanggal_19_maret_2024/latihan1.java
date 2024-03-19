public class latihan1 {
    public int nilaiAkhir_1(int[] array, int quiz, int softskill, int tugas, int uts, int uas, int nilai) {
        if (nilai <= 100 && nilai >= 80) {
            return 'A';
        } else if (nilai < 80 && nilai >= 68) {
            return 'B';
        } else if (nilai < 68 && nilai >= 56) {
            return 'C';
        } else if (nilai < 56 && nilai >= 45) {
            return 'D';
        } else if (nilai < 45) {
            return 'E';
        }
        return 0;
    }

    public String inputan(String npm, String nama) {

        if (nama == "Angga Afriliansyah") {
            return "2226250023";
        } else if (nama == "Cowalszki") {
            return "1492001";
        }
        return nama;

    }

    public double hasilAkhir(int quiz, int softskill, int tugas, int uts, int uas) {
        return 0.1 * quiz + 0.1 * softskill + 0.2 * tugas + 0.3 * uts + 0.3 * uas;
    }

    public static void main(String[] args) {

    }
}
