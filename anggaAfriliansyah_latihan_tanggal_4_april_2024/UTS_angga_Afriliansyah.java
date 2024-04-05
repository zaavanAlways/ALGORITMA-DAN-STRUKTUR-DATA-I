package anggaAfriliansyah_latihan_tanggal_4_april_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class UTS_angga_Afriliansyah{
    private String nama_angga;
    private String pendidikan_angga;
    private String unitKerja_angga;
    private double jamLembur_angga;
    private String id_angga;
    public UTS_angga_Afriliansyah(String nama_angga,String pendidikan_angga, String unitKerja_angga, double jamLembur_angga, String id_angga){
        this.nama_angga = nama_angga;
        this.pendidikan_angga = pendidikan_angga;
        this.unitKerja_angga = unitKerja_angga;
        this.jamLembur_angga = jamLembur_angga;
        this.id_angga = id_angga;
    }
 
    public double gajiPokok_angga(String pendidikan_angga){
        if(pendidikan_angga.equalsIgnoreCase("D3")){
            return 2750000;
        }else if(pendidikan_angga.equalsIgnoreCase("S1")){
            return 3250000;
        }else if(pendidikan_angga.equalsIgnoreCase("S2")){
            return 3750000;
        }
        return 0;
    }
    public double tunjanganUnitKerja_angga(String unitKerja_angga){
        if(unitKerja_angga.equalsIgnoreCase("keuangan")){
            return 1750000;
        }else if(unitKerja_angga.equalsIgnoreCase("marketing")){
            return 1500000;
        }
        return 0;
    }
    public double jamLembur_angga(){
        return  (jamLembur_angga * 100000);
    }
    public double totalGajiPegawai_angga(){
        return gajiPokok_angga(pendidikan_angga) + tunjanganUnitKerja_angga(pendidikan_angga) + jamLembur_angga();
    }

    public String nama_angga(){
        return nama_angga;
    }
   
    public static void main (String[]args) throws NumberFormatException, IOException{
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan jumlah data : ");
        int data_angga = Integer.parseInt(buff.readLine());

        UTS_angga_Afriliansyah [] asd = new UTS_angga_Afriliansyah[data_angga]; 

        for(int i = 0 ; i < data_angga ; i ++){
            System.out.println("Data Mahasiswa ke - " + (i+1));
            System.out.print("Masukkan nama : ");
            String nama_angga = buff.readLine();
            System.out.print("Masukkan ID : ");
            String id_angga = buff.readLine();
            System.out.print("masukkan unit : ");
            String unit_angga = buff.readLine();
            System.out.print("Masukkan pendidikan : ");
            String pendidikan_angga = buff.readLine();
            System.out.print("total Jam lembur : ");
            int jamLembur_angga = Integer.parseInt(buff.readLine());
            
            asd[i] = new UTS_angga_Afriliansyah(nama_angga, unit_angga, pendidikan_angga, jamLembur_angga, id_angga);
        }
        System.out.println("\nDaftar Gaji Pegawai:");
        for (UTS_angga_Afriliansyah i : asd) {
            System.out.println("Nama: " + i.nama_angga());
            System.out.println("Total Gaji: " + i.totalGajiPegawai_angga());
            System.out.println();
        }

    }
}