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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		String kodeBarang[] = new String[100];
		int jumlahBarang [] = new int [100];
		long hargaBarang[] = new long[100];
		String kodeVoucer;
		String namaBarang[] = new String[100];
		String voucer;	//apakah mempunyai voucer
		
		long totalHarga [] = new long[100];
		long bayar, potongan;
		int i = 0;
		bayar = 0;
		
		do
		{	
			System.out.print("Input Kode Barang \t= ");
			kodeBarang[i] = br.readLine();
			if (!kodeBarang[i].equals("-"))
			{
				namaBarang[i] = getNamaBarang(kodeBarang[i]);
				System.out.println("Nama Barang \t\t= " + namaBarang[i]);
				if(!namaBarang[i].equals("-"))
				{
					System.out.print("Input Harga Barang \t= ");
					hargaBarang[i] = Long.parseLong(br.readLine());
					System.out.print("Input Jumlah Beli \t= ");
					jumlahBarang[i] = Integer.parseInt(br.readLine());
					totalHarga[i] = getTotalHarga(hargaBarang[i], jumlahBarang[i]);
					bayar = bayar + totalHarga[i];
				}
				else
				{
					bayar = bayar + totalHarga[i];
					System.out.println("Kode Barang tidak terdaftar, silahkan ulangi!!");
				}
			}
			else
			{
				namaBarang[i] = "-";
			}
			System.out.println();
			i++;
		}while (!kodeBarang[i-1].equals("-") || !namaBarang[i-1].equals("-"));
		
		if(!kodeBarang[0].equals("-"))
		{
			System.out.print("\nApakah Anda Memiliki Voucer <Y/N> = ");
			voucer = br.readLine();
			if (voucer.equalsIgnoreCase("Y"))
			{
				do
				{
					System.out.print("Input Kode Voucer \t= ");
					kodeVoucer = br.readLine();
				} while (kodeVoucer.length() != 8);
				
				potongan = getPotonganHarga(kodeVoucer);
				System.out.println("Total Belanja Anda \t= " + bayar);
				bayar = bayar - potongan;
				System.out.println("Anda mendapatkan Diskon sebesar Rp." + potongan);
				System.out.println("Total Bayar Anda \t= Rp." + bayar);
			}
			else
			{
				System.out.println("Anda tidak mendapatkan Diskon");
				System.out.println("Total Bayar Anda \t= Rp." + bayar);
			}	
		}
		
	}
}
