package latihan_tanggal_27_februari_2024;

public class latihan2{
    //method dengan tipe String
    public static String getNPM_1(String npm){
        return npm;
    }
    //method dengan tipe long
    public static long getNPM_2(long npm){
        return npm;
    }
    //method generic
    public static <AnyType> AnyType getNPM_3(AnyType npm){
        return npm;
    }

    public static void main(String [] args){
        String NPM1 = "12345";
        long NPM2 = 12345;
        boolean x = true;
        getNPM_1(NPM1); //method dengan tipe String
        // getNPM_1(NPM2); eror
        getNPM_2(NPM2); //method dengan tipe long
        // getNPM_2(NPM1); eror 
        getNPM_3(NPM1); //method generic
        getNPM_3(NPM2); //method generic

        System.out.println("NPM  : " + getNPM_1(NPM1));
        System.out.println("NPM2 : " + getNPM_2(NPM2));
        System.out.println("NPM3 : " + getNPM_3(NPM1));
        System.out.println("NPM tersebut : " + getNPM_3(x));
    }
}