package anggaAfriliansyah_latihan_tanggal_4_april_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UTS_angga_Afriliansyah {
    BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
    UTS_angga_Afriliansyah[] data = new UTS_angga_Afriliansyah[100];
    String nama_angga, id_angga, unit_angga, pendidikan_angga;
    int jamLembur_angga, gajiPokok_angga, tunjangan_angga, totalGajiKaryawan_angga;

    public int gajiPokok_angga(String pendidikan_angga) {
        if (pendidikan_angga.equalsIgnoreCase("D3")) {
            return 2750000;
        } else if (pendidikan_angga.equalsIgnoreCase("S1")) {
            return 3250000;
        } else if (pendidikan_angga.equalsIgnoreCase("S2")) {
            return 3750000;
        } else {
            return 0;
        }
    }

    public int tunjanganKerja_angga(String unit_angga) {
        if (unit_angga.equalsIgnoreCase("Keuangan")) {
            return 1750000;
        } else if (unit_angga.equalsIgnoreCase("Marketing")) {
            return 1500000;
        } else {
            return 0;
        }
    }

    public int jamLembur_angga(int jamLembur_angga) {
        return jamLembur_angga * 100000;
    }

    public int totalGajiPegawai_angga(int gajiPokok_angga, int tunjangan_angga, int jamLembur_angga) {
        return gajiPokok_angga + tunjangan_angga + jamLembur_angga;
    }

    public void totalGajiAscending(int data_angga) {
        UTS_angga_Afriliansyah temp;
        for (int i = 0; i < data_angga; i++) {
            for (int j = 0; j < data_angga - i - 1; j++) {
                if (data[j].totalGajiKaryawan_angga > data[j + 1].totalGajiKaryawan_angga) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public String cariNamaPegawai(String cari, int data_angga) {
        for (int i = 0; i < data_angga; i++) {
            if (data[i].nama_angga.equalsIgnoreCase(cari)) {
                return "Data ditemukan !";
            }
        }
        return "Data Tidak Ditemukan !";
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        UTS_angga_Afriliansyah asd = new UTS_angga_Afriliansyah();

        System.out.print("Masukkan Jumlah Data : ");
        int data_angga = Integer.parseInt(asd.buff.readLine());
        System.out.println("------------------------------------------------------------------------------------");

        for (int i = 0; i < data_angga; i++) {
            asd.data[i] = new UTS_angga_Afriliansyah();
            System.out.println("Data Pegawai ke-" + (i + 1));
            System.out.print("Masukkan nama : ");
            asd.data[i].nama_angga = asd.buff.readLine();
            System.out.print("Masukkan id : ");
            asd.data[i].id_angga = asd.buff.readLine();
            System.out.print("Masukkan unit : ");
            asd.data[i].unit_angga = asd.buff.readLine();
            System.out.print("Masukkan Pendidikan : ");
            asd.data[i].pendidikan_angga = asd.buff.readLine();
            System.out.print("Total Jam Lembur  : ");
            asd.data[i].jamLembur_angga = Integer.parseInt(asd.buff.readLine());

            System.out.println();

            asd.data[i].gajiPokok_angga = asd.gajiPokok_angga(asd.data[i].pendidikan_angga);
            asd.data[i].tunjangan_angga = asd.tunjanganKerja_angga(asd.data[i].unit_angga);
            asd.data[i].jamLembur_angga = asd.jamLembur_angga(asd.data[i].jamLembur_angga);
            asd.data[i].totalGajiKaryawan_angga = asd.totalGajiPegawai_angga(asd.data[i].gajiPokok_angga,
                    asd.data[i].tunjangan_angga, asd.data[i].jamLembur_angga);
        }
        asd.totalGajiAscending(data_angga);
        System.out.println();
        System.out.printf("%-10s %-12s %-15s %-15s %-25s\n ", "Nama", "ID", "Unit", "Pendidikan", "Total Gaji");
        System.out.println();

        for (int i = 0; i < data_angga; i++) {
            System.out.printf("%-10s %-12s %-15s %-15s Rp.%-25s\n", asd.data[i].nama_angga, asd.data[i].id_angga,
                    asd.data[i].unit_angga, asd.data[i].pendidikan_angga, asd.data[i].totalGajiKaryawan_angga);
        }
        System.out.println();
        String cari;
        System.out.print("Masukkan Data yang dicari : ");
        cari = asd.buff.readLine();
        System.out.println("Hasil Pencarian : " + asd.cariNamaPegawai(cari, data_angga));

    }

}
