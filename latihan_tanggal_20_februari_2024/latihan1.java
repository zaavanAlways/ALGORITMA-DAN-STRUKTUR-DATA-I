package latihan_tanggal_20_februari_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihan1 
{
	public static String getNamaBarang (String kodeBarang)
	{
		if (kodeBarang.length() == 5)
		{
			if (kodeBarang.substring(0, 3).equalsIgnoreCase("A10"))
			{
				if (kodeBarang.substring(3).equalsIgnoreCase("11"))
				{
					return "Deterjen Merk A";
				}
				else if (kodeBarang.substring(3).equalsIgnoreCase("12"))
				{
					return "Deterjen Merk B";
				}
				else
				{
					return "-";
				}
			}
			else if (kodeBarang.substring(0, 3).equalsIgnoreCase("B20"))
			{
				if (kodeBarang.substring(3).equalsIgnoreCase("11"))
				{
					return "Shampoo Merk A";
				}
				else if (kodeBarang.substring(3).equalsIgnoreCase("12"))
				{
					return "Shampoo Merk B";
				}
				else
				{
					return "-";
				}
			}
			else if (kodeBarang.substring(0, 3).equalsIgnoreCase("C30"))
			{
				if (kodeBarang.substring(3).equalsIgnoreCase("11"))
				{
					return "Gula Merk A";
				}
				else if (kodeBarang.substring(3).equalsIgnoreCase("12"))
				{
					return "Gula Merk B";
				}
				else
				{
					return "-";
				}
			}
			else if (kodeBarang.substring(0, 3).equalsIgnoreCase("D40"))
			{
				if (kodeBarang.substring(3).equalsIgnoreCase("11"))
				{
					return "Minyak Merk A";
				}
				else if (kodeBarang.substring(3).equalsIgnoreCase("12"))
				{
					return "Minyak Merk B";
				}
				else
				{
					return "-";
				}
			}
			else if (kodeBarang.substring(0, 3).equalsIgnoreCase("E50"))
			{
				if (kodeBarang.substring(3).equalsIgnoreCase("11"))
				{
					return "Softener Merk A";
				}
				else if (kodeBarang.substring(3).equalsIgnoreCase("12"))
				{
					return "Softener Merk B";
				}
				else
				{
					return "-";
				}
			}
		}
		return "-";
	}
	
	public static long getPotonganHarga (String kodeVoucer)
	{
		if (kodeVoucer.equalsIgnoreCase("Diskon10"))
		{
			return 10000;
		}
		else if (kodeVoucer.equalsIgnoreCase("Diskon20"))
		{
			return 20000;
		}
		else if (kodeVoucer.equalsIgnoreCase("Diskon30"))
		{
			return 30000;
		}
		return 0;
	}
	public static long getTotalHarga (long harga, int jumlah)
	{
		return harga * jumlah;
	}
	public static long getTotalBayar (long total, long potongan)
	{
		return total - potongan;
	}
	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		String kodeBarang[] = new String[100];
		int jumlahBarang[] = new int[100];
		long hargaBarang[] = new long[100];
		String kodeVoucer[] = new String[100];
		String namaBarang[] = new String[100];
		String voucer;	//apakah mempunyai voucer
        
        System.out.print("Input Kode Barang :  ");
        kodeBarang[0] = buff.readLine();
        System.out.print("Input Harga Barang : ");
        hargaBarang[0]  = Long.parseLong(buff.readLine());
        System.out.print("Input Jumlah Beli : ");
        jumlahBarang[0] = Integer.parseInt(buff.readLine());
        
		System.out.println("Apakah Anda Memiliki Voucer <Y/N> : ");
		voucer = buff.readLine();

		if(voucer.equalsIgnoreCase("Y")){
			System.out.print("Input Kode Voucer : ");
			kodeVoucer[0] = buff.readLine();
		}else{
			kodeVoucer[0] = " - ";
		}

		System.out.println("Nama Barang: " + getNamaBarang(kodeBarang[0]));
        System.out.println("Total Harga: " + getTotalHarga(hargaBarang[0], jumlahBarang[0]));
        System.out.println("Potongan Harga: " + getPotonganHarga(voucer));
        System.out.println("Total Bayar: " + getTotalBayar(getTotalBayar(hargaBarang[0], jumlahBarang[0]), getPotonganHarga(voucer)));
        
	}

}
