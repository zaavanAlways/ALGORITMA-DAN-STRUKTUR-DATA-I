package test_latihan_tanggal_24_april_2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class latihanGua {
    BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
    String nama, id, pendidikan;
    int gajiPokokGuruTetap, gajiPokokGuruHonorer, totalGajiGuruHonorer, totalGaji, totalGajiGuruTetap;

    public int gajiPokokGuruTetap(String pendidikan) {
        if (pendidikan.equalsIgnoreCase("S1")) {
            return 3000000;
        } else if (pendidikan.equalsIgnoreCase("S2")) {
            return 3750000;
        } else {
            return 0;
        }
    }

    public int gajiPokokGuruHonorer() {
        return 2000000;
    }

    public totalGajiGuruHonorer

    public int totalGajiGuruTetap() {
        return tunjangan * gajiPokokGuruTetap;
    }

    public static void main(String[] args) {

    }
}